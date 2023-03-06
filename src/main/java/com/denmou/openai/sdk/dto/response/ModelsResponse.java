package com.denmou.openai.sdk.dto.response;

import com.denmou.openai.sdk.dto.vo.ErrorVo;
import com.denmou.openai.sdk.dto.vo.ModelVo;
import lombok.Data;

import java.util.List;

/**
 * @author denmou
 * @date 2023/3/3 09:10
 */
@Data
public class ModelsResponse {
    private List<ModelVo> data;
    private String object;
    private ErrorVo error;
}
