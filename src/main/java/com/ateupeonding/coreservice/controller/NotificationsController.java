package com.ateupeonding.coreservice.controller;

import com.ateupeonding.coreservice.jooq.generated.tables.pojos.Notification;
import com.ateupeonding.coreservice.mapper.NotificationMapper;
import com.ateupeonding.coreservice.model.dto.NotificationDto;
import com.ateupeonding.coreservice.service.api.NotificationService;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(ApiPaths.Notification.PATH)
public class NotificationsController {


    @Autowired
    private NotificationService notificationService;

    @Autowired
    private NotificationMapper mapper;



    @GetMapping
    public List<NotificationDto> get(@RequestParam String accountId,
                                     @RequestParam(required = false) Integer limit,
                                     @RequestParam(required = false) Integer offset) {
        List<Notification> notifications =
                notificationService.getNotificationsByUserId(ControllerUtils.parseIdToUUID(accountId), limit, offset);
        if (CollectionUtils.isEmpty(notifications)) {
            return Collections.emptyList();
        }
        return notifications.stream()
                .map(mapper::toDto)
                .collect(Collectors.toList());
    }


}
