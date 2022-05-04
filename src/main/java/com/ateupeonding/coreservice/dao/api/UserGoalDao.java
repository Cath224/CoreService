package com.ateupeonding.coreservice.dao.api;

import com.ateupeonding.coreservice.jooq.generated.tables.pojos.UserGoal;
import com.ateupeonding.coreservice.jooq.generated.tables.records.UserGoalRecord;

import java.util.UUID;

public interface UserGoalDao extends EntityDao<UserGoalRecord, UserGoal> {

    UserGoal getByAccountIdAndProductId(UUID account, UUID productId);

}
