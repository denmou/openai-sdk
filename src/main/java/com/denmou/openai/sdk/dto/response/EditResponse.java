package com.denmou.openai.sdk.dto.response;

import com.denmou.openai.sdk.dto.vo.ChoiceVo;
import com.denmou.openai.sdk.dto.vo.ErrorVo;
import com.denmou.openai.sdk.dto.vo.UsageVo;
import lombok.Data;

import java.util.List;

/**
 * @author denmou
 * @date 2023/3/3 09:14
 */
@Data
public class EditResponse {
    private String object;
    private Long created;
    private List<ChoiceVo> choices;
    private UsageVo usage;
    private ErrorVo error;
}
