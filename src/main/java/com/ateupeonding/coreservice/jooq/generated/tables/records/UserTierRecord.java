/*
 * This file is generated by jOOQ.
 */
package com.ateupeonding.coreservice.jooq.generated.tables.records;


import com.ateupeonding.coreservice.jooq.generated.enums.PaymentStatus;
import com.ateupeonding.coreservice.jooq.generated.tables.UserTier;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UserTierRecord extends UpdatableRecordImpl<UserTierRecord> implements Record6<UUID, UUID, UUID, BigDecimal, PaymentStatus, OffsetDateTime> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>ateupeonding_core.user_tier.id</code>.
     */
    public void setId(UUID value) {
        set(0, value);
    }

    /**
     * Getter for <code>ateupeonding_core.user_tier.id</code>.
     */
    public UUID getId() {
        return (UUID) get(0);
    }

    /**
     * Setter for <code>ateupeonding_core.user_tier.tier_id</code>.
     */
    public void setTierId(UUID value) {
        set(1, value);
    }

    /**
     * Getter for <code>ateupeonding_core.user_tier.tier_id</code>.
     */
    public UUID getTierId() {
        return (UUID) get(1);
    }

    /**
     * Setter for <code>ateupeonding_core.user_tier.account_id</code>.
     */
    public void setAccountId(UUID value) {
        set(2, value);
    }

    /**
     * Getter for <code>ateupeonding_core.user_tier.account_id</code>.
     */
    public UUID getAccountId() {
        return (UUID) get(2);
    }

    /**
     * Setter for <code>ateupeonding_core.user_tier.amount</code>.
     */
    public void setAmount(BigDecimal value) {
        set(3, value);
    }

    /**
     * Getter for <code>ateupeonding_core.user_tier.amount</code>.
     */
    public BigDecimal getAmount() {
        return (BigDecimal) get(3);
    }

    /**
     * Setter for <code>ateupeonding_core.user_tier.status</code>.
     */
    public void setStatus(PaymentStatus value) {
        set(4, value);
    }

    /**
     * Getter for <code>ateupeonding_core.user_tier.status</code>.
     */
    public PaymentStatus getStatus() {
        return (PaymentStatus) get(4);
    }

    /**
     * Setter for <code>ateupeonding_core.user_tier.created_timestamp</code>.
     */
    public void setCreatedTimestamp(OffsetDateTime value) {
        set(5, value);
    }

    /**
     * Getter for <code>ateupeonding_core.user_tier.created_timestamp</code>.
     */
    public OffsetDateTime getCreatedTimestamp() {
        return (OffsetDateTime) get(5);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<UUID> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row6<UUID, UUID, UUID, BigDecimal, PaymentStatus, OffsetDateTime> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    @Override
    public Row6<UUID, UUID, UUID, BigDecimal, PaymentStatus, OffsetDateTime> valuesRow() {
        return (Row6) super.valuesRow();
    }

    @Override
    public Field<UUID> field1() {
        return UserTier.USER_TIER.ID;
    }

    @Override
    public Field<UUID> field2() {
        return UserTier.USER_TIER.TIER_ID;
    }

    @Override
    public Field<UUID> field3() {
        return UserTier.USER_TIER.ACCOUNT_ID;
    }

    @Override
    public Field<BigDecimal> field4() {
        return UserTier.USER_TIER.AMOUNT;
    }

    @Override
    public Field<PaymentStatus> field5() {
        return UserTier.USER_TIER.STATUS;
    }

    @Override
    public Field<OffsetDateTime> field6() {
        return UserTier.USER_TIER.CREATED_TIMESTAMP;
    }

    @Override
    public UUID component1() {
        return getId();
    }

    @Override
    public UUID component2() {
        return getTierId();
    }

    @Override
    public UUID component3() {
        return getAccountId();
    }

    @Override
    public BigDecimal component4() {
        return getAmount();
    }

    @Override
    public PaymentStatus component5() {
        return getStatus();
    }

    @Override
    public OffsetDateTime component6() {
        return getCreatedTimestamp();
    }

    @Override
    public UUID value1() {
        return getId();
    }

    @Override
    public UUID value2() {
        return getTierId();
    }

    @Override
    public UUID value3() {
        return getAccountId();
    }

    @Override
    public BigDecimal value4() {
        return getAmount();
    }

    @Override
    public PaymentStatus value5() {
        return getStatus();
    }

    @Override
    public OffsetDateTime value6() {
        return getCreatedTimestamp();
    }

    @Override
    public UserTierRecord value1(UUID value) {
        setId(value);
        return this;
    }

    @Override
    public UserTierRecord value2(UUID value) {
        setTierId(value);
        return this;
    }

    @Override
    public UserTierRecord value3(UUID value) {
        setAccountId(value);
        return this;
    }

    @Override
    public UserTierRecord value4(BigDecimal value) {
        setAmount(value);
        return this;
    }

    @Override
    public UserTierRecord value5(PaymentStatus value) {
        setStatus(value);
        return this;
    }

    @Override
    public UserTierRecord value6(OffsetDateTime value) {
        setCreatedTimestamp(value);
        return this;
    }

    @Override
    public UserTierRecord values(UUID value1, UUID value2, UUID value3, BigDecimal value4, PaymentStatus value5, OffsetDateTime value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached UserTierRecord
     */
    public UserTierRecord() {
        super(UserTier.USER_TIER);
    }

    /**
     * Create a detached, initialised UserTierRecord
     */
    public UserTierRecord(UUID id, UUID tierId, UUID accountId, BigDecimal amount, PaymentStatus status, OffsetDateTime createdTimestamp) {
        super(UserTier.USER_TIER);

        setId(id);
        setTierId(tierId);
        setAccountId(accountId);
        setAmount(amount);
        setStatus(status);
        setCreatedTimestamp(createdTimestamp);
    }
}
