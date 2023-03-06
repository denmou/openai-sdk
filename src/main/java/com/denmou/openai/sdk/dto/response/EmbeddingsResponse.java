package com.denmou.openai.sdk.dto.response;

import com.denmou.openai.sdk.dto.vo.EmbeddingVo;
import com.denmou.openai.sdk.dto.vo.ErrorVo;
import com.denmou.openai.sdk.dto.vo.UsageVo;
import lombok.Data;

import java.util.List;

/**
 * @author denmou
 * @date 2023/3/3 10:25
 */
@Data
public class EmbeddingsResponse {
    private String object;
    private List<EmbeddingVo> data;
    private String model;
    private UsageVo usage;
    private ErrorVo error;
}
