package com.denmou.openai.sdk.config;

import lombok.Data;

/**
 * @author denmou
 * @date 2023/3/2 10:07
 */
@Data
public class OpenaiConfig {
    private String host;
    private String contentType;
    private String token;
}
