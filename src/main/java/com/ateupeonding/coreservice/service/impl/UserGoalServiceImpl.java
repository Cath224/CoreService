package com.ateupeonding.coreservice.service.impl;

import com.ateupeonding.coreservice.dao.api.UserGoalDao;
import com.ateupeonding.coreservice.jooq.generated.tables.pojos.UserGoal;
import com.ateupeonding.coreservice.jooq.generated.tables.records.UserGoalRecord;
import com.ateupeonding.coreservice.query.PaymentRequestSender;
import com.ateupeonding.coreservice.service.api.UserGoalService;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UserGoalServiceImpl extends EntityServiceImpl<UserGoalRecord, UserGoal> implements UserGoalService {

    private final PaymentRequestSender paymentRequestSender;
    private final UserGoalDao dao;


    public UserGoalServiceImpl(PaymentRequestSender paymentRequestSender, UserGoalDao dao) {
        super(dao);
        this.dao = dao;
        this.paymentRequestSender = paymentRequestSender;
    }

    @Override
    public UserGoal create(UserGoal pojo) {
        UserGoal goal = super.create(pojo);
        paymentRequestSender.sendGoalPaymentRequest(goal);
        return goal;
    }

    @Override
    public UserGoal getByAccountIdAndProductId(UUID userId, UUID productId) {
        return dao.getByAccountIdAndProductId(userId, productId);
    }
}
