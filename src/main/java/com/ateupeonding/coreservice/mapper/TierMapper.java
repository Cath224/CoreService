package com.ateupeonding.coreservice.mapper;

import com.ateupeonding.coreservice.jooq.generated.tables.pojos.Tier;
import com.ateupeonding.coreservice.model.dto.TierDto;
import org.mapstruct.Mapper;

@Mapper(config = EntityMapper.class)
public abstract class TierMapper implements EntityMapper<Tier, TierDto>{
}
