package com.denmou.openai.sdk.cache;

import com.denmou.openai.sdk.dto.vo.MessageVo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author denmou
 * @date 2023/3/4 17:02
 */
public class DefaultChatCache implements ChatCache {
    private final Map<String, List<MessageVo>> chatCache;

    public DefaultChatCache() {
        chatCache = new HashMap<>();
    }

    @Override
    public List<MessageVo> getChatRecord(String chatId) {
        return chatCache.computeIfAbsent(chatId, v -> new ArrayList<>());
    }

    @Override
    public void addChatRecord(String chatId, MessageVo... records) {
        for (MessageVo record : records) {
            chatCache.computeIfAbsent(chatId, v -> new ArrayList<>()).add(record);
        }
    }
}
