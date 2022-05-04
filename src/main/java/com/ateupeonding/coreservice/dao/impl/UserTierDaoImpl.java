package com.ateupeonding.coreservice.dao.impl;

import com.ateupeonding.coreservice.dao.api.UserTierDao;
import com.ateupeonding.coreservice.jooq.generated.tables.pojos.UserTier;
import com.ateupeonding.coreservice.jooq.generated.tables.records.UserTierRecord;
import org.jooq.Configuration;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public class UserTierDaoImpl extends EntityDaoImpl<UserTierRecord, UserTier> implements UserTierDao {

    public UserTierDaoImpl(Configuration configuration) {
        super(configuration, com.ateupeonding.coreservice.jooq.generated.tables.UserTier.USER_TIER, UserTier.class);
    }

    @Override
    public UUID getId(UserTier object) {
        return object.getId();
    }

    @Override
    public UserTier getByAccountIdAndProductId(UUID accountId, UUID productId) {
        com.ateupeonding.coreservice.jooq.generated.tables.UserTier table = (com.ateupeonding.coreservice.jooq.generated.tables.UserTier) getTable();
        return ctx().selectFrom(table)
                .where(table.ACCOUNT_ID.eq(accountId).and(table.TIER_ID.eq(productId)))
                .fetchOneInto(getType());
    }
}
