package com.ateupeonding.coreservice.service.impl;

import com.ateupeonding.coreservice.dao.api.NotificationDao;
import com.ateupeonding.coreservice.jooq.generated.tables.pojos.Notification;
import com.ateupeonding.coreservice.jooq.generated.tables.records.NotificationRecord;
import com.ateupeonding.coreservice.service.api.NotificationService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class NotificationServiceImpl extends EntityServiceImpl<NotificationRecord, Notification> implements NotificationService {

    private final NotificationDao dao;

    public NotificationServiceImpl(NotificationDao dao) {
        super(dao);
        this.dao = dao;
    }


    @Override
    public List<Notification> getNotificationsByUserId(UUID accountId, Integer limit, Integer offset) {
        return dao.getNotificationsByUserId(accountId, limit, offset);
    }
}
