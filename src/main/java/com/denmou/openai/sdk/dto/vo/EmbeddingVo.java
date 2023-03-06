package com.denmou.openai.sdk.dto.vo;

import lombok.Data;

/**
 * @author denmou
 * @date 2023/3/3 10:26
 */
@Data
public class EmbeddingVo {
    private String object;
    private Double[] embedding;
    private Integer index;
}
