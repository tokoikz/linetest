package com.example.webhook.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.webhook.model.LineWebhookPayload;

@RestController
public class WebHookController {

    @PostMapping("/webhook")
    public void handleWebhook(@RequestBody LineWebhookPayload payload) {
        payload.getEvents().stream()
                .filter(event -> event.getType().equals("follow"))
                .forEach(event -> {
                    String userId = event.getSource().getUserId();
                    System.out.println("User ID: " + userId);
                    // ここでuserIdをフロントエンドに送信するなど、必要な処理を行います。
                });
    }
}