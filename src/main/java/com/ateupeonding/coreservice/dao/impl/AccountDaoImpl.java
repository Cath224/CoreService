package com.ateupeonding.coreservice.dao.impl;

import com.ateupeonding.coreservice.dao.api.AccountDao;
import com.ateupeonding.coreservice.jooq.generated.tables.pojos.Account;
import com.ateupeonding.coreservice.jooq.generated.tables.records.AccountRecord;
import org.jooq.Configuration;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public class AccountDaoImpl extends EntityDaoImpl<AccountRecord, Account> implements AccountDao {


    public AccountDaoImpl(@Qualifier("CoreServiceJooqConfiguration") Configuration configuration) {
        super(configuration, com.ateupeonding.coreservice.jooq.generated.tables.Account.ACCOUNT, Account.class);
    }

    @Override
    public UUID getId(Account object) {
        return object.getId();
    }
}
