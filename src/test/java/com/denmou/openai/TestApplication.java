package com.denmou.openai;

import com.denmou.openai.sdk.Channel;
import com.denmou.openai.sdk.cache.ChatCache;
import com.denmou.openai.sdk.cache.DefaultChatCache;
import com.denmou.openai.sdk.dto.response.ChatResponse;
import com.denmou.openai.sdk.dto.vo.ChoiceVo;
import com.denmou.openai.sdk.utils.HttpClient;
import lombok.extern.slf4j.Slf4j;
import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.constructor.Constructor;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

/**
 * @author denmou
 * @date 2023/3/6 11:05
 */
@Slf4j
public class TestApplication {
    public static void main(String... args) {
        InputStream inputStream = TestApplication.class.getClassLoader().getResourceAsStream("application.yml");
        OpenAiTestConfig config = new Yaml(new Constructor(OpenAiTestConfig.class)).load(inputStream);
        HttpClient httpClient = new HttpClient(config.getOpenai());
        ChatCache chatCache = new DefaultChatCache();
        Channel channel = new Channel(httpClient, config.getChat(), chatCache);
        Scanner scanner = new Scanner(System.in);
        String chatId = "test";
        String message;
        ChatResponse chatResponse;
        System.out.println("可以开始对话了。");
        while (true) {
            System.out.print("< ");
            message = scanner.nextLine();
            try {
                chatResponse = channel.chat(chatId, message);
            } catch (Exception e) {
                System.out.println("请求失败：" + e.getMessage());
                continue;
            }
            if (null == chatResponse.getError()) {
                for (ChoiceVo choice : chatResponse.getChoices()) {
                    System.out.println("> " + choice.getMessage().getContent().trim());
                }
            }
        }
    }
}
