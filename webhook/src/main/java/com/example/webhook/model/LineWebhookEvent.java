package com.example.webhook.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class LineWebhookEvent {
    @JsonProperty("type")
    private String type;

    @JsonProperty("source")
    private LineWebhookSource source;
}