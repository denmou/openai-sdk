package com.denmou.openai.sdk.dto.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * @author denmou
 * @date 2023/3/3 09:36
 */
@Data
public class ChoiceVo {
    /**
     * completions response use
     */
    private String text;
    private Integer index;
    /**
     * completions response use
     */
    @JsonProperty("logprobs")
    private Integer logProbs;
    @JsonProperty("finish_reason")
    private String finishReason;
    /**
     * chat response use
     */
    private MessageVo message;
}
