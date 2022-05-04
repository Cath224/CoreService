package com.ateupeonding.coreservice.service.api;

import com.ateupeonding.coreservice.jooq.generated.tables.pojos.UserTier;
import com.ateupeonding.coreservice.jooq.generated.tables.records.UserTierRecord;

import java.util.UUID;

public interface UserTierService extends EntityService<UserTierRecord, UserTier>{

    UserTier getByAccountIdAndProductId(UUID accountId, UUID productId);

}
