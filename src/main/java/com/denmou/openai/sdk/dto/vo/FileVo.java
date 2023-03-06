package com.denmou.openai.sdk.dto.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * @author denmou
 * @date 2023/3/3 10:49
 */
@Data
public class FileVo {
    private String id;
    private String object;
    private Long bytes;
    @JsonProperty("created_at")
    private Long createdAt;
    private String filename;
    private String purpose;
    /**
     * delete file use.
     */
    private Boolean deleted;
}
