package com.ateupeonding.coreservice.dao.impl;

import com.ateupeonding.coreservice.dao.api.GoalDao;
import com.ateupeonding.coreservice.jooq.generated.tables.pojos.Goal;
import com.ateupeonding.coreservice.jooq.generated.tables.records.GoalRecord;
import org.jooq.Configuration;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public class GoalDaoImpl extends EntityDaoImpl<GoalRecord, Goal> implements GoalDao {

    public GoalDaoImpl(Configuration configuration) {
        super(configuration, com.ateupeonding.coreservice.jooq.generated.tables.Goal.GOAL, Goal.class);
    }

    @Override
    public UUID getId(Goal object) {
        return object.getId();
    }
}
