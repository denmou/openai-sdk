package com.denmou.openai.sdk.dto.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

/**
 * @author denmou
 * @date 2023/3/3 09:10
 */
@Data
public class ModelVo {
    private String id;
    private String object;
    @JsonProperty("owned_by")
    private String ownedBy;
    private List<Object> permission;
}
