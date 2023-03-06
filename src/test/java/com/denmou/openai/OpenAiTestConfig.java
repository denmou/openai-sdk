package com.denmou.openai;

import com.denmou.openai.sdk.config.ChatConfig;
import com.denmou.openai.sdk.config.OpenaiConfig;
import lombok.Data;

/**
 * @author denmou
 * @date 2023/3/6 09:39
 */
@Data
public class OpenAiTestConfig {
    private OpenaiConfig openai;
    private ChatConfig chat;
}
