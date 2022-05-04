package com.ateupeonding.coreservice.controller;

import com.ateupeonding.coreservice.jooq.generated.tables.pojos.Goal;
import com.ateupeonding.coreservice.jooq.generated.tables.records.GoalRecord;
import com.ateupeonding.coreservice.mapper.GoalMapper;
import com.ateupeonding.coreservice.model.dto.GoalDto;
import com.ateupeonding.coreservice.service.api.GoalService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(ApiPaths.Goal.PATH)
public class GoalController extends EntityController<GoalRecord, Goal, GoalDto>{

    public GoalController(GoalService service, GoalMapper mapper) {
        super(service, mapper);
    }
}
