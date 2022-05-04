package com.ateupeonding.coreservice.mapper;

import com.ateupeonding.coreservice.jooq.generated.tables.pojos.Account;
import com.ateupeonding.coreservice.model.dto.AccountDto;
import org.mapstruct.Mapper;

@Mapper(config = EntityMapper.class)
public abstract class AccountMapper implements EntityMapper<Account, AccountDto> {
}
