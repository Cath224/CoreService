package com.ateupeonding.coreservice.service.api;

import com.ateupeonding.coreservice.jooq.generated.tables.pojos.UserGoal;
import com.ateupeonding.coreservice.jooq.generated.tables.records.UserGoalRecord;

import java.util.UUID;

public interface UserGoalService extends EntityService<UserGoalRecord, UserGoal>{

    UserGoal getByAccountIdAndProductId(UUID accountId, UUID productId);

}
