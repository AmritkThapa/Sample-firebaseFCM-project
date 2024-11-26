package com.amrit.firebaseFCM.controller;

import com.amrit.firebaseFCM.constant.ApiConstant;
import com.amrit.firebaseFCM.dto.ApiResponse;
import com.amrit.firebaseFCM.dto.NotificationMessage;
import com.amrit.firebaseFCM.service.FireBaseService;
import com.google.firebase.messaging.FirebaseMessagingException;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping(ApiConstant.NOTIFICATION)
public class FCMController {
    private final FireBaseService fireBaseService;

    @PostMapping(ApiConstant.SEND)
    public ApiResponse sendNotification(@RequestBody NotificationMessage notificationMessage) throws FirebaseMessagingException {
        return fireBaseService.sendNotification(notificationMessage);
    }
}
