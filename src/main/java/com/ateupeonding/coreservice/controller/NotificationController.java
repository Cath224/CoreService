package com.ateupeonding.coreservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;

@RestController
public class NotificationController {

    @GetMapping("notifications")
    public SseEmitter handleNotifications() {
        SseEmitter emitter = new SseEmitter();

        return emitter;
    }

}
