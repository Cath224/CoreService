package com.ateupeonding.coreservice.dao.impl;

import com.ateupeonding.coreservice.dao.api.UserGoalDao;
import com.ateupeonding.coreservice.jooq.generated.tables.pojos.UserGoal;
import com.ateupeonding.coreservice.jooq.generated.tables.records.UserGoalRecord;
import org.jooq.Configuration;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public class UserGoalDaoImpl extends EntityDaoImpl<UserGoalRecord, UserGoal> implements UserGoalDao {

    protected UserGoalDaoImpl(Configuration configuration) {
        super(configuration, com.ateupeonding.coreservice.jooq.generated.tables.UserGoal.USER_GOAL, UserGoal.class);
    }

    @Override
    public UUID getId(UserGoal object) {
        return object.getId();
    }

    @Override
    public UserGoal getByAccountIdAndProductId(UUID account, UUID productId) {
        com.ateupeonding.coreservice.jooq.generated.tables.UserGoal table = (com.ateupeonding.coreservice.jooq.generated.tables.UserGoal) getTable();
        return ctx().selectFrom(table)
                .where(table.ACCOUNT_ID.eq(account).and(table.GOAL_ID.eq(productId)))
                .fetchOneInto(getType());
    }
}
