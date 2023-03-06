package com.denmou.openai.sdk.dto.vo;

import lombok.Data;

/**
 * @author denmou
 * @date 2023/3/6 11:43
 */
@Data
public class ErrorVo {
    private String message;
    private String type;
    private String param;
    private String code;
}
