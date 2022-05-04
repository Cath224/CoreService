package com.ateupeonding.coreservice.mapper;

import com.ateupeonding.coreservice.jooq.generated.tables.pojos.Notification;
import com.ateupeonding.coreservice.model.dto.NotificationDto;
import org.mapstruct.Mapper;

@Mapper(config = EntityMapper.class)
public abstract class NotificationMapper implements EntityMapper<Notification, NotificationDto> {
}
