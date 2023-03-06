package com.denmou.openai.sdk.dto.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * @author denmou
 * @date 2023/3/3 11:25
 */
@Data
public class FineTuneFileVo {
    private String id;
    private String object;
    private Integer bytes;
    @JsonProperty("createdAt")
    private Long createdAt;
    private String filename;
    private String purpose;
}
