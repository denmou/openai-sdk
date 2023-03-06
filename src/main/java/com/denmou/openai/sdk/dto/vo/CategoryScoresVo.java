package com.denmou.openai.sdk.dto.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * @author denmou
 * @date 2023/3/3 11:06
 */
@Data
public class CategoryScoresVo {
    private Double hate;
    @JsonProperty("hate/threatening")
    private Double hateThreatening;
    @JsonProperty("self-harm")
    private Double selfHarm;
    private Double sexual;
    @JsonProperty("sexual/minors")
    private Double sexualMinors;
    private Double violence;
    @JsonProperty("violence/graphic")
    private Double violenceGraphic;
}
