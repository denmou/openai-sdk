package com.denmou.openai.sdk.dto.response;

import com.denmou.openai.sdk.dto.vo.ErrorVo;
import com.denmou.openai.sdk.dto.vo.FileVo;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author denmou
 * @date 2023/3/3 11:00
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class FileDeleteResponse extends FileVo {
    private ErrorVo error;
}
