package com.denmou.openai.sdk.dto.request;

import lombok.Builder;
import lombok.Data;

/**
 * @author denmou
 * @date 2023/3/3 10:55
 */
@Data
@Builder
public class FileUploadRequest implements OpenAiRequest {
    /**
     * file string Required<p>
     * Name of the <a href="https://jsonlines.readthedocs.io/en/latest/" target="_blank" rel="noopener noreferrer">JSON Lines</a> file to be uploaded.<p>
     * If the purpose is set to "fine-tune", each line is a JSON record with "prompt" and "completion" fields representing your <a href="https://platform.openai.com/docs/guides/fine-tuning/prepare-training-data">training examples</a>.
     **/
    private String file;
    /**
     * purpose string Required<p>
     * The intended purpose of the uploaded documents.<p>
     * Use "fine-tune" for <a href="https://platform.openai.com/docs/api-reference/fine-tunes">Fine-tuning</a>. This allows us to validate the format of the uploaded file.
     **/
    private String purpose;
}
