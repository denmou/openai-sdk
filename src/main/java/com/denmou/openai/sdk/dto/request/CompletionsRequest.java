package com.denmou.openai.sdk.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

import java.util.Map;

/**
 * @author denmou
 * @date 2023/3/3 09:15
 */
@Data
@Builder
public class CompletionsRequest implements OpenAiRequest {
    /**
     * string Required<p>
     * ID of the model to use.
     * You can use the <a href="https://platform.openai.com/docs/api-reference/models/list">List models</a>
     * API to see all of your available models,
     * or see our <a href="https://platform.openai.com/docs/models/overview">Model overview</a> for descriptions of them.
     */
    private String model;
    /**
     * string or array Optional Defaults to <|endoftext|><p>
     * The prompt(s) to generate completions for, encoded as a string, array of strings,
     * array of tokens, or array of token arrays.<p>
     * Note that <|endoftext|> is the document separator that the model sees during training,
     * so if a prompt is not specified the model will generate as if from the beginning of a new document.
     */
    private String prompt;
    /**
     * string Optional Defaults to null<p>
     * The suffix that comes after a completion of inserted text.
     */
    private String suffix;
    /**
     * integer Optional Defaults to 16<p>
     * The maximum number of <a href="https://platform.openai.com/tokenizer">tokens</a>
     * to generate in the completion.<p>
     * The token count of your prompt plus max_tokens cannot exceed the model's context length.
     * Most models have a context length of 2048 tokens (except for the newest models, which support 4096).
     */
    @JsonProperty("max_tokens")
    private Integer maxTokens;
    /**
     * number Optional Defaults to 1<p>
     * What sampling temperature to use, between 0 and 2.
     * Higher values like 0.8 will make the output more random,
     * while lower values like 0.2 will make it more focused and deterministic.<p>
     * We generally recommend altering this or top_p but not both.
     */
    private Double temperature;
    /**
     * number Optional Defaults to 1<p>
     * An alternative to sampling with temperature, called nucleus sampling,
     * where the model considers the results of the tokens with top_p probability mass.
     * So 0.1 means only the tokens comprising the top 10% probability mass are considered.<p>
     * We generally recommend altering this or temperature but not both.
     */
    @JsonProperty("top_p")
    private Double topP;
    /**
     * integer Optional Defaults to 1<p>
     * How many completions to generate for each prompt.<p>
     * Note: Because this parameter generates many completions, it can quickly consume your token quota.
     * Use carefully and ensure that you have reasonable settings for max_tokens and stop.
     */
    private Integer n;
    /**
     * boolean Optional Defaults to false<p>
     * Whether to stream back partial progress.
     * If set, tokens will be sent as data-only
     * <a href="https://developer.mozilla.org/en-US/docs/Web/API/Server-sent_events/Using_server-sent_events#Event_stream_format" target="_blank" rel="noopener noreferrer">server-sent events</a>
     * as they become available, with the stream terminated by a data: [DONE] message.
     */
    private Boolean stream;
    /**
     * integer Optional Defaults to null<p>
     * Include the log probabilities on the logprobs most likely tokens, as well the chosen tokens.
     * For example, if logprobs is 5, the API will return a list of the 5 most likely tokens.
     * The API will always return the logprob of the sampled token,
     * so there may be up to logprobs+1 elements in the response.<p>
     * The maximum value for logprobs is 5. If you need more than this,
     * please contact us through our <a href="https://help.openai.com" target="_blank" rel="noopener noreferrer">Help center</a> and describe your use case.
     */
    private Integer logprobs;
    /**
     * boolean Optional Defaults to false<p>
     * Echo back the prompt in addition to the completion
     */
    private Boolean echo;
    /**
     * string or array Optional Defaults to null<p>
     * Up to 4 sequences where the API will stop generating further tokens.
     * The returned text will not contain the stop sequence.
     */
    private String stop;
    /**
     * number Optional Defaults to 0<p>
     * Number between -2.0 and 2.0.
     * Positive values penalize new tokens based on whether they appear in the text so far,
     * increasing the model's likelihood to talk about new topics.<p>
     * <a href="https://platform.openai.com/docs/api-reference/parameter-details">See more information about frequency and presence penalties.</a>.
     */
    @JsonProperty("presence_penalty")
    private Double presencePenalty;
    /**
     * number Optional Defaults to 0<p>
     * Number between -2.0 and 2.0.
     * Positive values penalize new tokens based on their existing frequency in the text so far,
     * decreasing the model's likelihood to repeat the same line verbatim.<p>
     * <a href="https://platform.openai.com/docs/api-reference/parameter-details">See more information about frequency and presence penalties.</a>.
     */
    @JsonProperty("frequency_penalty")
    private Double frequencyPenalty;
    /**
     * integer Optional Defaults to 1<p>
     * Generates best_of completions server-side
     * and returns the "best" (the one with the highest log probability per token). Results cannot be streamed.<p>
     * When used with n, best_of controls the number of candidate completions and n specifies
     * how many to return – best_of must be greater than n.<p>
     * Note: Because this parameter generates many completions, it can quickly consume your token quota.
     * Use carefully and ensure that you have reasonable settings for max_tokens and stop.
     */
    @JsonProperty("best_of")
    private Integer bestOf;
    /**
     * map Optional Defaults to null<p>
     * Modify the likelihood of specified tokens appearing in the completion.<p>
     * Accepts a json object that maps tokens (specified by their token ID in the GPT tokenizer)
     * to an associated bias value from -100 to 100.
     * You can use this <a href="https://platform.openai.com/tokenizer?view=bpe">tokenizer tool</a>
     * (which works for both GPT-2 and GPT-3) to convert text to token IDs.
     * Mathematically, the bias is added to the logits generated by the model prior to sampling.
     * The exact effect will vary per model, but values between -1 and 1 should decrease
     * or increase likelihood of selection; values like -100 or 100 should result in a ban
     * or exclusive selection of the relevant token.<p>
     * As an example, you can pass {"50256": -100} to prevent the <|endoftext|> token from being generated.
     */
    @JsonProperty("logit_bias")
    private Map<String, Object> logitBias;
    /**
     * string Optional<p>
     * A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse.
     * <a href="https://platform.openai.com/docs/guides/safety-best-practices/end-user-ids">Learn more</a>.
     */
    private String user;
}
