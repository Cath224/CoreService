package com.ateupeonding.coreservice.controller;

import com.ateupeonding.coreservice.jooq.generated.tables.pojos.UserTier;
import com.ateupeonding.coreservice.jooq.generated.tables.records.UserTierRecord;
import com.ateupeonding.coreservice.mapper.UserTierMapper;
import com.ateupeonding.coreservice.model.dto.UserTierDto;
import com.ateupeonding.coreservice.service.api.UserTierService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(ApiPaths.UserTier.PATH)
public class UserTierController extends EntityController<UserTierRecord, UserTier, UserTierDto>{


    public UserTierController(UserTierService service, UserTierMapper mapper) {
        super(service, mapper);
    }


}
