package com.denmou.openai.sdk.dto.response;

import com.denmou.openai.sdk.dto.vo.ErrorVo;
import lombok.Data;

/**
 * @author denmou
 * @date 2023/3/3 10:30
 */
@Data
public class AudioResponse {
    private String text;
    private ErrorVo error;
}
