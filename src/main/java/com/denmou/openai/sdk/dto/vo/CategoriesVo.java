package com.denmou.openai.sdk.dto.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * @author denmou
 * @date 2023/3/3 11:04
 */
@Data
public class CategoriesVo {
    private Boolean hate;
    @JsonProperty("hate/threatening")
    private Boolean hateThreatening;
    @JsonProperty("self-harm")
    private Boolean selfHarm;
    private Boolean sexual;
    @JsonProperty("sexual/minors")
    private Boolean sexualMinors;
    private Boolean violence;
    @JsonProperty("violence/graphic")
    private Boolean violenceGraphic;
}
