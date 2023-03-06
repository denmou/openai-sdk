package com.denmou.openai.sdk.config;

import lombok.Data;

/**
 * @author denmou
 * @date 2023/3/2 10:07
 */
@Data
public class ChatConfig {
    private String url;
    private String role;
    private String model;
}
