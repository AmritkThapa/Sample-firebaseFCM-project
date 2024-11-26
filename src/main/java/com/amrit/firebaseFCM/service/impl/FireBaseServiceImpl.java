package com.amrit.firebaseFCM.service.impl;

import com.amrit.firebaseFCM.dto.ApiResponse;
import com.amrit.firebaseFCM.dto.NotificationMessage;
import com.amrit.firebaseFCM.service.FireBaseService;
import com.amrit.firebaseFCM.util.ResponseUtil;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.FirebaseMessagingException;
import com.google.firebase.messaging.Message;
import com.google.firebase.messaging.Notification;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class FireBaseServiceImpl implements FireBaseService {
    private final FirebaseMessaging firebaseMessaging;
    @Override
    public ApiResponse sendNotification(NotificationMessage notificationMessage) {
        Notification notification = Notification
                .builder()
                .setTitle(notificationMessage.getTitle())
                .setBody(notificationMessage.getBody())
                .setImage(notificationMessage.getImage())
                .build();

        Message message = Message.builder()
                .setNotification(notification)
                .setTopic(notificationMessage.getTopic())
//                .setToken(notificationMessage.getRecipientToken())
                .putAllData(notificationMessage.getData())
                .build();

        log.info("Notification Content: {}", notificationMessage.getTopic());

        try {
            String response = firebaseMessaging.send(message);
            return ResponseUtil.getSuccessfulApiResponse(response, "Notification sent successfully");
        } catch (FirebaseMessagingException e) {
            return ResponseUtil.getFailureResponse(e.getMessage(), "Failed to send notification");
        }
    }
}
