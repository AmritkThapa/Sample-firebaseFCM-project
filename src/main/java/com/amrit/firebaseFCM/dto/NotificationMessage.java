package com.amrit.firebaseFCM.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Map;

@Getter
@Setter
public class NotificationMessage {
    private String topic;
    private String recipientToken;
    private String title;
    private String body;
    private String image;
    private Map<String, String> data;
}
