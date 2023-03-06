package com.denmou.openai.sdk.dto.response;

import com.denmou.openai.sdk.dto.vo.ErrorVo;
import com.denmou.openai.sdk.dto.vo.ModelVo;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author denmou
 * @date 2023/3/3 09:10
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ModelResponse extends ModelVo {
    private ErrorVo error;
}
