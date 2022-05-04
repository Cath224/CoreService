package com.ateupeonding.coreservice.model.dto;

import java.time.OffsetDateTime;
import java.util.UUID;

public class EntityDto {

    private UUID id;
    private OffsetDateTime createdTimestamp = OffsetDateTime.now();

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public OffsetDateTime getCreatedTimestamp() {
        return createdTimestamp;
    }

    public void setCreatedTimestamp(OffsetDateTime createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
    }
}
