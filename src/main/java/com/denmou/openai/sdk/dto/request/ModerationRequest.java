package com.denmou.openai.sdk.dto.request;

import lombok.Builder;
import lombok.Data;

/**
 * @author denmou
 * @date 2023/3/3 11:03
 */
@Data
@Builder
public class ModerationRequest implements OpenAiRequest {
    /**
     * input string or array Required<p>
     * The input text to classify
     **/
    private String input;
    /**
     * model string Optional Defaults to text-moderation-latest<p>
     * Two content moderations models are available: text-moderation-stable and text-moderation-latest.<p>
     * The default is text-moderation-latest which will be automatically upgraded over time. This ensures you are always using our most accurate model. If you use text-moderation-stable, we will provide advanced notice before updating the model. Accuracy of text-moderation-stable may be slightly lower than for text-moderation-latest.
     **/
    private String model;
}
