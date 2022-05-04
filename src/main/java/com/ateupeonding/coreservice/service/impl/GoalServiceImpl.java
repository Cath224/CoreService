package com.ateupeonding.coreservice.service.impl;

import com.ateupeonding.coreservice.dao.api.GoalDao;
import com.ateupeonding.coreservice.jooq.generated.tables.pojos.Goal;
import com.ateupeonding.coreservice.jooq.generated.tables.records.GoalRecord;
import com.ateupeonding.coreservice.service.api.GoalService;
import org.springframework.stereotype.Service;

@Service
public class GoalServiceImpl extends EntityServiceImpl<GoalRecord, Goal> implements GoalService {

    public GoalServiceImpl(GoalDao dao) {
        super(dao);
    }


}
