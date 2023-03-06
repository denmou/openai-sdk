package com.denmou.openai.sdk.dto.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * @author denmou
 * @date 2023/3/3 09:38
 */
@Data
public class UsageVo {
    @JsonProperty("prompt_tokens")
    private Integer promptTokens;
    /**
     * embeddings not use
     */
    @JsonProperty("completion_tokens")
    private Integer completionTokens;
    @JsonProperty("total_tokens")
    private Integer totalTokens;
}
