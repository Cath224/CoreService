package com.ateupeonding.coreservice.controller;

import com.ateupeonding.coreservice.jooq.generated.tables.pojos.UserGoal;
import com.ateupeonding.coreservice.jooq.generated.tables.records.UserGoalRecord;
import com.ateupeonding.coreservice.mapper.UserGoalMapper;
import com.ateupeonding.coreservice.model.dto.UserGoalDto;
import com.ateupeonding.coreservice.service.api.UserGoalService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(ApiPaths.UserGoal.PATH)
public class UserGoalController extends EntityController<UserGoalRecord, UserGoal, UserGoalDto>{

    public UserGoalController(UserGoalService service, UserGoalMapper mapper) {
        super(service, mapper);
    }

}
