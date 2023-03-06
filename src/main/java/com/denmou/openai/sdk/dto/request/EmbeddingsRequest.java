package com.denmou.openai.sdk.dto.request;

import lombok.Builder;
import lombok.Data;

/**
 * @author denmou
 * @date 2023/3/3 10:11
 */
@Data
@Builder
public class EmbeddingsRequest implements OpenAiRequest {
    /**
     * model string Required<p>
     * ID of the model to use. You can use the
     * <a href="https://platform.openai.com/docs/api-reference/models/list">List models</a>
     * API to see all of your available models, or see our
     * <a href="https://platform.openai.com/docs/models/overview">Model overview</a> for descriptions of them.
     **/
    private String model;
    /**
     * input string or array Required<p>
     * Input text to get embeddings for, encoded as a string or array of tokens.
     * To get embeddings for multiple inputs in a single request, pass an array of strings or array of token arrays.
     * Each input must not exceed 8192 tokens in length.
     **/
    private String input;
    /**
     * user string Optional<p>
     * A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse.
     * <a href="https://platform.openai.com/docs/guides/safety-best-practices/end-user-ids">Learn more</a>.
     **/
    private String user;
}
