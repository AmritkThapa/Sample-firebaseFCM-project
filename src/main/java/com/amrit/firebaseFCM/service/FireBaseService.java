package com.amrit.firebaseFCM.service;

import com.amrit.firebaseFCM.dto.ApiResponse;
import com.amrit.firebaseFCM.dto.NotificationMessage;

public interface FireBaseService {
    ApiResponse sendNotification(NotificationMessage notificationMessage);
}
