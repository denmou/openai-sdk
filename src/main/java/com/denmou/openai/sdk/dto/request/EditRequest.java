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
public class EditRequest implements OpenAiRequest {
    /**
     * model string Required<p>
     * ID of the model to use. You can use the text-davinci-edit-001 or code-davinci-edit-001 model with this endpoint.
     **/
    private String model;
    /**
     * input string Optional Defaults to ''<p>
     * The input text to use as a starting point for the edit.
     **/
    private String input;
    /**
     * instruction string Required<p>
     * The instruction that tells the model how to edit the prompt.
     **/
    private String instruction;
    /**
     * n integer Optional Defaults to 1<p>
     * How many edits to generate for the input and instruction.
     **/
    private Integer n;
    /**
     * temperature number Optional Defaults to 1<p>
     * What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic.<p>
     * We generally recommend altering this or top_p but not both.
     **/
    private Double temperature;
    /**
     * top_p number Optional Defaults to 1<p>
     * An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.<p>
     * We generally recommend altering this or temperature but not both.
     **/
    @JsonProperty("top_p")
    private Double topP;
}
