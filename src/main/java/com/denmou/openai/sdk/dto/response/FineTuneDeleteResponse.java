package com.denmou.openai.sdk.dto.response;

import com.denmou.openai.sdk.dto.vo.ErrorVo;
import lombok.Data;

/**
 * @author denmou
 * @date 2023/3/3 16:14
 */
@Data
public class FineTuneDeleteResponse {
    private String id;
    private String object;
    private Boolean deleted;
    private ErrorVo error;
}
