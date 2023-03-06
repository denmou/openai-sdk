package com.denmou.openai.sdk.throwable;

/**
 * @author denmou
 * @date 2023/3/4 17:26
 */
public class OpenAiException extends RuntimeException {
    public OpenAiException(Throwable e) {
        super(e);
    }
}
