package com.denmou.openai.sdk.dto.response;

import com.denmou.openai.sdk.dto.vo.ErrorVo;
import com.denmou.openai.sdk.dto.vo.FileVo;
import lombok.Data;

import java.util.List;

/**
 * @author denmou
 * @date 2023/3/3 10:56
 */
@Data
public class FileListResponse {
    private List<FileVo> data;
    private String object;
    private ErrorVo error;
}
