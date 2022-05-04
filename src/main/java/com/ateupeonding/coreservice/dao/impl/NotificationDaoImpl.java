package com.ateupeonding.coreservice.dao.impl;

import com.ateupeonding.coreservice.dao.api.NotificationDao;
import com.ateupeonding.coreservice.jooq.generated.tables.pojos.Notification;
import com.ateupeonding.coreservice.jooq.generated.tables.records.NotificationRecord;
import org.jooq.Configuration;
import org.jooq.Table;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public class NotificationDaoImpl extends EntityDaoImpl<NotificationRecord, Notification> implements NotificationDao {


    public NotificationDaoImpl(Configuration configuration) {
        super(configuration, com.ateupeonding.coreservice.jooq.generated.tables.Notification.NOTIFICATION, Notification.class);
    }

    @Override
    public UUID getId(Notification object) {
        return object.getId();
    }


    @Override
    public List<Notification> getNotificationsByUserId(UUID accountId, Integer offset, Integer limit) {
        com.ateupeonding.coreservice.jooq.generated.tables.Notification table = (com.ateupeonding.coreservice.jooq.generated.tables.Notification) getTable();
        return ctx().selectFrom(table)
                .where(table.ACCOUNT_ID.eq(accountId))
                .orderBy(table.CREATED_TIMESTAMP.desc())
                .offset(offset)
                .limit(limit)
                .fetchInto(getType());
    }
}
