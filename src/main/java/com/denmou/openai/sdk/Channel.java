package com.denmou.openai.sdk;

import com.denmou.openai.sdk.cache.ChatCache;
import com.denmou.openai.sdk.config.ChatConfig;
import com.denmou.openai.sdk.dto.request.ChatRequest;
import com.denmou.openai.sdk.dto.response.ChatResponse;
import com.denmou.openai.sdk.dto.vo.ChoiceVo;
import com.denmou.openai.sdk.dto.vo.MessageVo;
import com.denmou.openai.sdk.utils.HttpClient;
import lombok.extern.slf4j.Slf4j;

import java.util.*;

/**
 * @author denmou
 * @date 2023/3/3 16:50
 */
@Slf4j
public class Channel {
    private final HttpClient httpClient;
    private final ChatConfig chatConfig;
    private final ChatCache chatCache;

    public Channel(HttpClient httpClient, ChatConfig chatConfig, ChatCache chatCache) {
        this.httpClient = httpClient;
        this.chatConfig = chatConfig;
        this.chatCache = chatCache;
    }

    public ChatResponse chat(String chatId, String message) {
        List<MessageVo> messages = new ArrayList<>(chatCache.getChatRecord(chatId));
        long current = System.currentTimeMillis();
        MessageVo messageVo = new MessageVo(chatConfig.getRole(), message);
        messages.add(messageVo);
        ChatRequest request = ChatRequest.builder().model(chatConfig.getModel()).messages(messages).build();
        ChatResponse response = httpClient.post(chatConfig.getUrl(), request, ChatResponse.class);
        if (null == response.getError()) {
            log.info("[" + chatId + "]本次对话响应时间[" + (System.currentTimeMillis() - current)
                    + "]ms，累计对答次数[" + (messages.size() + 1) + "]");
            chatCache.addChatRecord(chatId, messageVo);
            for (ChoiceVo choiceVo : response.getChoices()) {
                chatCache.addChatRecord(chatId, choiceVo.getMessage());
            }
        } else {
            log.warn("请求返回错误，错误信息: " + response.getError());
        }
        return response;
    }
}
