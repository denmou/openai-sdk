package com.denmou.openai.sdk.utils;

import com.denmou.openai.sdk.config.OpenaiConfig;
import com.denmou.openai.sdk.constant.HttpMethod;
import com.denmou.openai.sdk.dto.request.OpenAiRequest;
import com.denmou.openai.sdk.throwable.OpenAiException;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.net.ssl.HttpsURLConnection;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.URL;

/**
 * @author denmou
 * @date 2023/3/3 16:31
 */
public class HttpClient {
    private final OpenaiConfig config;
    private final ObjectMapper mapper;

    public HttpClient(OpenaiConfig config) {
        this.config = config;
        mapper = new ObjectMapper();
        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    }

    public <T> T get(String url, Class<T> clazz) {
        return request(HttpMethod.GET, url, null, clazz);
    }

    public <T> T post(String url, OpenAiRequest request, Class<T> clazz) {
        try {
            String body = mapper.writeValueAsString(request);
            return request(HttpMethod.POST, url, body, clazz);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    private <T> T request(String method, String url, String body, Class<T> clazz) {
        Writer out = null;
        HttpsURLConnection connection = null;
        InputStream inputStream = null;
        try {
            ObjectMapper mapper = new ObjectMapper();
            mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
            mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            URL realUrl = new URL(config.getHost() + url);
            connection = (HttpsURLConnection) realUrl.openConnection();
            connection.setDoOutput(true);
            connection.setDoInput(true);
            connection.setUseCaches(true);
            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Type", config.getContentType());
            connection.setRequestProperty("Authorization", config.getToken());
            connection.connect();
            if (null != body && HttpMethod.POST.equals(method)) {
                out = new OutputStreamWriter(connection.getOutputStream());
                out.write(body);
                out.flush();
            }
            int status = connection.getResponseCode();
            inputStream = status == 200 ? connection.getInputStream() : connection.getErrorStream();
            return mapper.readValue(inputStream, clazz);
        } catch (IOException e) {
            throw new OpenAiException(e);
        } finally {
            if (null != out) {
                try {
                    out.close();
                } catch (IOException ignore) {
                }
            }
            if (null != inputStream) {
                try {
                    inputStream.close();
                } catch (IOException ignore) {
                }
            }
            if (null != connection) {
                connection.disconnect();
            }
        }
    }
}
