package com.denmou.openai.sdk.dto.response;

import com.denmou.openai.sdk.dto.vo.ErrorVo;
import com.denmou.openai.sdk.dto.vo.UrlVo;
import lombok.Data;

import java.util.List;

/**
 * @author denmou
 * @date 2023/3/3 09:14
 */
@Data
public class ImageResponse {
    private Long created;
    private List<UrlVo> data;
    private ErrorVo error;
}
