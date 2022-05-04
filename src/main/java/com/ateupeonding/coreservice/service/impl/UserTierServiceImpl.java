package com.ateupeonding.coreservice.service.impl;

import com.ateupeonding.coreservice.dao.api.UserTierDao;
import com.ateupeonding.coreservice.jooq.generated.tables.pojos.Tier;
import com.ateupeonding.coreservice.jooq.generated.tables.pojos.UserTier;
import com.ateupeonding.coreservice.jooq.generated.tables.records.UserTierRecord;
import com.ateupeonding.coreservice.query.PaymentRequestSender;
import com.ateupeonding.coreservice.service.api.TierService;
import com.ateupeonding.coreservice.service.api.UserTierService;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.UUID;

@Service
public class UserTierServiceImpl extends EntityServiceImpl<UserTierRecord, UserTier> implements UserTierService {


    private final PaymentRequestSender paymentRequestSender;

    private final TierService tierService;
    private final UserTierDao dao;

    public UserTierServiceImpl(PaymentRequestSender paymentRequestSender, UserTierDao dao, TierService tierService) {
        super(dao);
        this.dao = dao;
        this.paymentRequestSender = paymentRequestSender;
        this.tierService = tierService;
    }

    @Override
    public UserTier create(UserTier pojo) {
        Tier tier = tierService.getById(pojo.getTierId());
        BigDecimal amount = pojo.getAmount();
        if (amount == null || tier.getAmount().compareTo(amount) >= 1) {
            pojo.setAmount(tier.getAmount());
        }
        UserTier userTier = super.create(pojo);
        paymentRequestSender.sendTierPaymentRequest(userTier);
        return userTier;
    }

    @Override
    public UserTier getByAccountIdAndProductId(UUID accountId, UUID productId) {
        return dao.getByAccountIdAndProductId(accountId, productId);
    }
}
