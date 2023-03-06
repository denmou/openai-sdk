package com.denmou.openai.sdk.cache;

import com.denmou.openai.sdk.dto.vo.MessageVo;

import java.util.List;

/**
 * @author denmou
 * @date 2023/3/4 17:02
 */
public interface ChatCache {
    /**
     * 根据聊天id获取聊天记录
     *
     * @param chatId 聊天id
     * @return 聊天记录
     */
    List<MessageVo> getChatRecord(String chatId);

    /**
     * 向聊天id添加聊天记录
     *
     * @param chatId  聊天id
     * @param records 聊天记录
     */
    void addChatRecord(String chatId, MessageVo... records);
}
