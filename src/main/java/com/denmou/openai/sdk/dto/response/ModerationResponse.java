package com.denmou.openai.sdk.dto.response;

import com.denmou.openai.sdk.dto.vo.ErrorVo;
import com.denmou.openai.sdk.dto.vo.ResultVo;
import lombok.Data;

import java.util.List;

/**
 * @author denmou
 * @date 2023/3/3 11:08
 */
@Data
public class ModerationResponse {
    private String id;
    private String model;
    private List<ResultVo> results;
    private ErrorVo error;
}
