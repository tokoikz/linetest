package com.example.webhook.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class LineWebhookPayload {
    @JsonProperty("events")
    private List<LineWebhookEvent> events;
}