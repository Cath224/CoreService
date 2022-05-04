package com.ateupeonding.coreservice.mapper;

import com.ateupeonding.coreservice.jooq.generated.tables.pojos.UserTier;
import com.ateupeonding.coreservice.model.dto.UserTierDto;
import org.mapstruct.Mapper;

@Mapper(config = EntityMapper.class)
public abstract class UserTierMapper implements EntityMapper<UserTier, UserTierDto> {
}
