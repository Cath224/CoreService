/*
 * This file is generated by jOOQ.
 */
package com.ateupeonding.coreservice.jooq.generated.tables.pojos;


import com.ateupeonding.coreservice.jooq.generated.enums.PaymentStatus;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UserGoal implements Serializable {

    private static final long serialVersionUID = 1L;

    private UUID           id;
    private UUID           goalId;
    private UUID           accountId;
    private BigDecimal     amount;
    private PaymentStatus  status;
    private OffsetDateTime createdTimestamp;

    public UserGoal() {}

    public UserGoal(UserGoal value) {
        this.id = value.id;
        this.goalId = value.goalId;
        this.accountId = value.accountId;
        this.amount = value.amount;
        this.status = value.status;
        this.createdTimestamp = value.createdTimestamp;
    }

    public UserGoal(
        UUID           id,
        UUID           goalId,
        UUID           accountId,
        BigDecimal     amount,
        PaymentStatus  status,
        OffsetDateTime createdTimestamp
    ) {
        this.id = id;
        this.goalId = goalId;
        this.accountId = accountId;
        this.amount = amount;
        this.status = status;
        this.createdTimestamp = createdTimestamp;
    }

    /**
     * Getter for <code>ateupeonding_core.user_goal.id</code>.
     */
    public UUID getId() {
        return this.id;
    }

    /**
     * Setter for <code>ateupeonding_core.user_goal.id</code>.
     */
    public void setId(UUID id) {
        this.id = id;
    }

    /**
     * Getter for <code>ateupeonding_core.user_goal.goal_id</code>.
     */
    public UUID getGoalId() {
        return this.goalId;
    }

    /**
     * Setter for <code>ateupeonding_core.user_goal.goal_id</code>.
     */
    public void setGoalId(UUID goalId) {
        this.goalId = goalId;
    }

    /**
     * Getter for <code>ateupeonding_core.user_goal.account_id</code>.
     */
    public UUID getAccountId() {
        return this.accountId;
    }

    /**
     * Setter for <code>ateupeonding_core.user_goal.account_id</code>.
     */
    public void setAccountId(UUID accountId) {
        this.accountId = accountId;
    }

    /**
     * Getter for <code>ateupeonding_core.user_goal.amount</code>.
     */
    public BigDecimal getAmount() {
        return this.amount;
    }

    /**
     * Setter for <code>ateupeonding_core.user_goal.amount</code>.
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
     * Getter for <code>ateupeonding_core.user_goal.status</code>.
     */
    public PaymentStatus getStatus() {
        return this.status;
    }

    /**
     * Setter for <code>ateupeonding_core.user_goal.status</code>.
     */
    public void setStatus(PaymentStatus status) {
        this.status = status;
    }

    /**
     * Getter for <code>ateupeonding_core.user_goal.created_timestamp</code>.
     */
    public OffsetDateTime getCreatedTimestamp() {
        return this.createdTimestamp;
    }

    /**
     * Setter for <code>ateupeonding_core.user_goal.created_timestamp</code>.
     */
    public void setCreatedTimestamp(OffsetDateTime createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("UserGoal (");

        sb.append(id);
        sb.append(", ").append(goalId);
        sb.append(", ").append(accountId);
        sb.append(", ").append(amount);
        sb.append(", ").append(status);
        sb.append(", ").append(createdTimestamp);

        sb.append(")");
        return sb.toString();
    }
}
