package com.ateupeonding.coreservice.service.api;

import com.ateupeonding.coreservice.jooq.generated.tables.pojos.Notification;
import com.ateupeonding.coreservice.jooq.generated.tables.records.NotificationRecord;

import java.util.List;
import java.util.UUID;

public interface NotificationService extends EntityService<NotificationRecord, Notification> {

    List<Notification> getNotificationsByUserId(UUID accountId, Integer limit, Integer offset);

}
