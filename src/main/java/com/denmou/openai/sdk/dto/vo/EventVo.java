package com.denmou.openai.sdk.dto.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * @author denmou
 * @date 2023/3/3 11:16
 */
@Data
public class EventVo {
    private String object;
    @JsonProperty("created_at")
    private Long createdAt;
    private String level;
    private String message;
}
