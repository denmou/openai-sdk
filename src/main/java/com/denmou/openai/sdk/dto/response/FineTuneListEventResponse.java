package com.denmou.openai.sdk.dto.response;

import com.denmou.openai.sdk.dto.vo.ErrorVo;
import com.denmou.openai.sdk.dto.vo.EventVo;
import lombok.Data;

import java.util.List;

/**
 * @author denmou
 * @date 2023/3/3 16:14
 */
@Data
public class FineTuneListEventResponse {
    private String object;
    private List<EventVo> data;
    private ErrorVo error;
}
