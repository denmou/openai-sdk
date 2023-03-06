package com.denmou.openai.sdk.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

/**
 * @author denmou
 * @date 2023/3/3 10:30
 */
@Data
@Builder
public class AudioTranscriptionsRequest implements OpenAiRequest {
    /**
     * file string Required<p>
     * The audio file to transcribe, in one of these formats: mp3, mp4, mpeg, mpga, m4a, wav, or webm.
     **/
    private String file;
    /**
     * model string Required<p>
     * ID of the model to use. Only whisper-1 is currently available.
     **/
    private String model;
    /**
     * prompt string Optional<p>
     * An optional text to guide the model's style or continue a previous audio segment.
     * The <a href="https://platform.openai.com/docs/guides/speech-to-text/prompting">prompt</a>
     * should match the audio language.
     **/
    private String prompt;
    /**
     * response_format string Optional Defaults to json<p>
     * The format of the transcript output, in one of these options: json, text, srt, verbose_json, or vtt.
     **/
    @JsonProperty("response_format")
    private String responseFormat;
    /**
     * temperature number Optional Defaults to 0<p>
     * The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random,
     * while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use
     * <a href="https://en.wikipedia.org/wiki/Log_probability" target="_blank" rel="noopener noreferrer">log probability</a>
     * to automatically increase the temperature until certain thresholds are hit.
     **/
    private Double temperature;
    /**
     * language string Optional<p>
     * The language of the input audio. Supplying the input language in
     * <a href="https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes" target="_blank" rel="noopener noreferrer">ISO-639-1</a>
     * format will improve accuracy and latency.
     **/
    private String language;
}
