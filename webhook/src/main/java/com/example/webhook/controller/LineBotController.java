package com.example.webhook.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LineBotController {

    @PostMapping("/line/webhook")
    public void webhook(@RequestBody String payload) {
        // payloadはJSON形式の文字列です。これを適切にパースしてユーザIDなどの情報を取り出します。
        // ここでは簡易的にSystem.out.printlnで出力していますが、
        // 実際にはJSONパースライブラリ（例えばJacksonなど）を使用して情報を取り出すべきです。
        System.out.println(payload);
    }

}