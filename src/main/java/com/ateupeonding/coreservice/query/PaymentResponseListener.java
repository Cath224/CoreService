package com.ateupeonding.coreservice.query;

import com.ateupeonding.coreservice.jooq.generated.enums.PaymentStatus;
import com.ateupeonding.coreservice.jooq.generated.tables.pojos.Notification;
import com.ateupeonding.coreservice.jooq.generated.tables.pojos.UserGoal;
import com.ateupeonding.coreservice.jooq.generated.tables.pojos.UserTier;
import com.ateupeonding.coreservice.model.dto.PaymentResponse;
import com.ateupeonding.coreservice.model.dto.notification.NotificationsMessages;
import com.ateupeonding.coreservice.model.dto.type.ProductType;
import com.ateupeonding.coreservice.service.api.NotificationService;
import com.ateupeonding.coreservice.service.api.UserGoalService;
import com.ateupeonding.coreservice.service.api.UserTierService;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.OffsetDateTime;
import java.util.UUID;

import static com.ateupeonding.coreservice.configuration.MessagingConfiguration.PAYMENT_RESPONSE_QUEUE;

@Component
public class PaymentResponseListener {

    @Autowired
    private UserTierService userTierService;

    @Autowired
    private UserGoalService userGoalService;

    @Autowired
    private NotificationService notificationService;

    @RabbitListener(queues = PAYMENT_RESPONSE_QUEUE)
    public void listenPaymentResponse(PaymentResponse paymentResponse) {
        ProductType productType = paymentResponse.getProductType();
        if (ProductType.GOAL.equals(productType)) {
            UUID productId = paymentResponse.getProductId();
            UUID accountId = paymentResponse.getUserId();
            UserGoal userGoal = userGoalService.getByAccountIdAndProductId(accountId, productId);
            userGoal.setStatus(convertToStatus(paymentResponse.getStatus()));
            userGoalService.update(userGoal);
            sendNotification(paymentResponse);
        } else if (ProductType.TIER.equals(productType)) {
            UUID productId = paymentResponse.getProductId();
            UUID accountId = paymentResponse.getUserId();
            UserTier userTier = userTierService.getByAccountIdAndProductId(accountId, productId);
            userTier.setStatus(convertToStatus(paymentResponse.getStatus()));
            userTierService.update(userTier);
            sendNotification(paymentResponse);
        }
    }

    private PaymentStatus convertToStatus(com.ateupeonding.coreservice.model.dto.type.PaymentStatus paymentStatus) {
        if (com.ateupeonding.coreservice.model.dto.type.PaymentStatus.DENIED.equals(paymentStatus)) {
            return PaymentStatus.DENIED;
        } else if (com.ateupeonding.coreservice.model.dto.type.PaymentStatus.PAID.equals(paymentStatus)) {
            return PaymentStatus.PAYED;
        }
        return PaymentStatus.IN_PROGRESS;
    }

    private void sendNotification(PaymentResponse paymentResponse) {
        Notification notification = createNotification(paymentResponse.getUserId(), paymentResponse.getProductType().name());
        notificationService.create(notification);
    }

    private Notification createNotification(UUID accountId, String type) {
        Notification notification = new Notification();
        notification.setAccountId(accountId);
        notification.setTitle(NotificationsMessages.PaymentNotifications.TITLE);
        notification.setDescription(String.format(NotificationsMessages.PaymentNotifications.DESCRIPTION, type));
        notification.setCreatedTimestamp(OffsetDateTime.now());
        return notification;
    }

}
