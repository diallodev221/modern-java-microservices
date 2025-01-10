package com.diallodev.notification;

import com.diallodev.clients.notification.NotificationRequest;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public record NotificationService(NotificationRepository notificationRepository) {


    public void send(NotificationRequest notificationRequest) {
        notificationRepository.save(
                Notification.builder()
                        .toCustomerId(notificationRequest.toCustomerId())
                        .toCustomerEmail(notificationRequest.toCustomerEmail())
                        .message(notificationRequest.message())
                        .sender("DialloDev")
                        .sendAt(LocalDateTime.now())
                        .build()
        );
    }
}
