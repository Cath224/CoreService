package com.ateupeonding.coreservice.mapper;

import com.ateupeonding.coreservice.jooq.generated.tables.pojos.Goal;
import com.ateupeonding.coreservice.model.dto.GoalDto;
import org.mapstruct.Mapper;

@Mapper(config = EntityMapper.class)
public abstract class GoalMapper implements EntityMapper<Goal, GoalDto> {
}
