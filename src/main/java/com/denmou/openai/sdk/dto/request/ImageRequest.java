package com.denmou.openai.sdk.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

/**
 * @author denmou
 * @date 2023/3/3 09:53
 */
@Data
@Builder
public class ImageRequest implements OpenAiRequest {
    /**
     * prompt string Required<p>
     * A text description of the desired image(s). The maximum length is 1000 characters.
     **/
    private String prompt;
    /**
     * n integer Optional Defaults to 1<p>
     * The number of images to generate. Must be between 1 and 10.
     **/
    private Integer n;
    /**
     * size string Optional Defaults to 1024x1024<p>
     * The size of the generated images. Must be one of 256x256, 512x512, or 1024x1024.
     **/
    private String size;
    /**
     * response_format string Optional Defaults to url<p>
     * The format in which the generated images are returned. Must be one of url or b64_json.
     **/
    @JsonProperty("response_format")
    private String responseFormat;
    /**
     * user string Optional<p>
     * A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse.
     * <a href="https://platform.openai.com/docs/guides/safety-best-practices/end-user-ids">Learn more</a>.
     **/
    private String user;
}
