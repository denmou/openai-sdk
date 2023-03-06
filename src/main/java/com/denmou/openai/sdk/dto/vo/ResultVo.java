package com.denmou.openai.sdk.dto.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * @author denmou
 * @date 2023/3/3 11:07
 */
@Data
public class ResultVo {
    private CategoriesVo categories;
    @JsonProperty("category_scores")
    private CategoryScoresVo categoryScores;
    private Boolean flagged;
}
