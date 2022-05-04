package com.ateupeonding.coreservice.dao.impl;

import com.ateupeonding.coreservice.dao.api.TierDao;
import com.ateupeonding.coreservice.jooq.generated.tables.pojos.Tier;
import com.ateupeonding.coreservice.jooq.generated.tables.records.TierRecord;
import org.jooq.Configuration;
import org.jooq.Table;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public class TierDaoImpl extends EntityDaoImpl<TierRecord, Tier> implements TierDao {

    public TierDaoImpl(Configuration configuration) {
        super(configuration, com.ateupeonding.coreservice.jooq.generated.tables.Tier.TIER, Tier.class);
    }

    @Override
    public UUID getId(Tier object) {
        return object.getId();
    }
}
