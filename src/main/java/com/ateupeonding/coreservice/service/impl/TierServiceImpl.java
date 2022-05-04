package com.ateupeonding.coreservice.service.impl;

import com.ateupeonding.coreservice.dao.api.TierDao;
import com.ateupeonding.coreservice.jooq.generated.tables.pojos.Tier;
import com.ateupeonding.coreservice.jooq.generated.tables.records.TierRecord;
import com.ateupeonding.coreservice.service.api.TierService;
import org.springframework.stereotype.Service;

@Service
public class TierServiceImpl extends EntityServiceImpl<TierRecord, Tier> implements TierService {

    public TierServiceImpl(TierDao dao) {
        super(dao);
    }


}
