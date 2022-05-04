package com.ateupeonding.coreservice.dao.api;

import com.ateupeonding.coreservice.jooq.generated.tables.pojos.Notification;
import com.ateupeonding.coreservice.jooq.generated.tables.records.NotificationRecord;

import java.util.List;
import java.util.UUID;

public interface NotificationDao extends EntityDao<NotificationRecord, Notification> {


    List<Notification> getNotificationsByUserId(UUID accountId, Integer offset, Integer limit);

}
