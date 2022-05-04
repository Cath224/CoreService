package com.ateupeonding.coreservice.dao.api;

import com.ateupeonding.coreservice.jooq.generated.tables.pojos.Account;
import com.ateupeonding.coreservice.jooq.generated.tables.records.AccountRecord;

import java.util.UUID;

public interface AccountDao extends EntityDao<AccountRecord, Account>{
}
