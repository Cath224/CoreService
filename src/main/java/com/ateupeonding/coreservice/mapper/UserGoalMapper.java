package com.ateupeonding.coreservice.mapper;

import com.ateupeonding.coreservice.jooq.generated.tables.pojos.UserGoal;
import com.ateupeonding.coreservice.model.dto.UserGoalDto;
import org.mapstruct.Mapper;

@Mapper(config = EntityMapper.class)
public abstract class UserGoalMapper implements EntityMapper<UserGoal, UserGoalDto> {
}
