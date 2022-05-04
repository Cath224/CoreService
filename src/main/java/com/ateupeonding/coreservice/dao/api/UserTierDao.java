package com.ateupeonding.coreservice.dao.api;

import com.ateupeonding.coreservice.jooq.generated.tables.pojos.UserTier;
import com.ateupeonding.coreservice.jooq.generated.tables.records.UserTierRecord;

import java.util.UUID;

public interface UserTierDao extends EntityDao<UserTierRecord, UserTier>{


    UserTier getByAccountIdAndProductId(UUID accountId, UUID productId);

}
