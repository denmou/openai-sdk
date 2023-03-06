package com.denmou.openai.sdk.dto.response;

import com.denmou.openai.sdk.dto.vo.ErrorVo;
import com.denmou.openai.sdk.dto.vo.EventVo;
import com.denmou.openai.sdk.dto.vo.FineTuneVo;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * @author denmou
 * @date 2023/3/3 16:14
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class FineTuneRetrieveResponse extends FineTuneVo {
    private List<EventVo> events;
    private ErrorVo error;
}
