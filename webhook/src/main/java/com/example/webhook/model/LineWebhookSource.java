package com.example.webhook.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class LineWebhookSource {
    @JsonProperty("userId")
    private String userId;
}
