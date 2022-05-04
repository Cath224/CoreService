package com.ateupeonding.coreservice.controller;

import com.ateupeonding.coreservice.jooq.generated.tables.pojos.Tier;
import com.ateupeonding.coreservice.jooq.generated.tables.records.TierRecord;
import com.ateupeonding.coreservice.mapper.TierMapper;
import com.ateupeonding.coreservice.model.dto.TierDto;
import com.ateupeonding.coreservice.service.api.TierService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(ApiPaths.Tier.PATH)
public class TierController extends EntityController<TierRecord, Tier, TierDto> {


    public TierController(TierService service, TierMapper mapper) {
        super(service, mapper);
    }


}
