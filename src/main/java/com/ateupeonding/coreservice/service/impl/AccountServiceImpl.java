package com.ateupeonding.coreservice.service.impl;

import com.ateupeonding.coreservice.dao.api.AccountDao;
import com.ateupeonding.coreservice.jooq.generated.tables.pojos.Account;
import com.ateupeonding.coreservice.jooq.generated.tables.records.AccountRecord;
import com.ateupeonding.coreservice.service.api.AccountService;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl extends EntityServiceImpl<AccountRecord, Account> implements AccountService {

    public AccountServiceImpl(AccountDao accountDao) {
        super(accountDao);
    }

}
