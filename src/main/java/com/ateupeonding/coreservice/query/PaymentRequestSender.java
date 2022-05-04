package com.ateupeonding.coreservice.query;

import com.ateupeonding.coreservice.jooq.generated.tables.pojos.UserGoal;
import com.ateupeonding.coreservice.jooq.generated.tables.pojos.UserTier;
import com.ateupeonding.coreservice.model.dto.PaymentRequest;
import com.ateupeonding.coreservice.model.dto.type.ProductType;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import static com.ateupeonding.coreservice.configuration.MessagingConfiguration.PAYMENT_REQUEST_QUEUE;

@Component
public class PaymentRequestSender {


    @Autowired
    private RabbitTemplate rabbitTemplate;


    public void sendTierPaymentRequest(UserTier userTier) {
        PaymentRequest paymentRequest = new PaymentRequest();
        paymentRequest.setUserId(userTier.getAccountId());
        paymentRequest.setAmount(userTier.getAmount());
        paymentRequest.setProductType(ProductType.TIER);
        paymentRequest.setProductId(userTier.getTierId());
        rabbitTemplate.convertAndSend(PAYMENT_REQUEST_QUEUE, paymentRequest);
    }


    public void sendGoalPaymentRequest(UserGoal userGoal) {
        PaymentRequest paymentRequest = new PaymentRequest();
        paymentRequest.setUserId(userGoal.getAccountId());
        paymentRequest.setAmount(userGoal.getAmount());
        paymentRequest.setProductType(ProductType.GOAL);
        paymentRequest.setProductId(userGoal.getGoalId());
        rabbitTemplate.convertAndSend(PAYMENT_REQUEST_QUEUE, paymentRequest);
    }

}
