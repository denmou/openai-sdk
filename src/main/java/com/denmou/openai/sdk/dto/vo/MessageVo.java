package com.denmou.openai.sdk.dto.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author denmou
 * @date 2023/3/2 10:34
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MessageVo {
    private String role;
    private String content;
}
