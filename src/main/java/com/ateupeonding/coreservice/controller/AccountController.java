package com.ateupeonding.coreservice.controller;

import com.ateupeonding.coreservice.jooq.generated.tables.pojos.Account;
import com.ateupeonding.coreservice.jooq.generated.tables.records.AccountRecord;
import com.ateupeonding.coreservice.mapper.AccountMapper;
import com.ateupeonding.coreservice.model.dto.AccountDto;
import com.ateupeonding.coreservice.service.api.AccountService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(ApiPaths.Account.PATH)
public class AccountController extends EntityController<AccountRecord, Account, AccountDto> {


    public AccountController(AccountService service, AccountMapper mapper) {
        super(service, mapper);
    }
}
