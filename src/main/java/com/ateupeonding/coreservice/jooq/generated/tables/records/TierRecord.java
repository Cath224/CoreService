/*
 * This file is generated by jOOQ.
 */
package com.ateupeonding.coreservice.jooq.generated.tables.records;


import com.ateupeonding.coreservice.jooq.generated.tables.Tier;

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
public class TierRecord extends UpdatableRecordImpl<TierRecord> implements Record6<UUID, String, String, BigDecimal, UUID, OffsetDateTime> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>ateupeonding_core.tier.id</code>.
     */
    public void setId(UUID value) {
        set(0, value);
    }

    /**
     * Getter for <code>ateupeonding_core.tier.id</code>.
     */
    public UUID getId() {
        return (UUID) get(0);
    }

    /**
     * Setter for <code>ateupeonding_core.tier.title</code>.
     */
    public void setTitle(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>ateupeonding_core.tier.title</code>.
     */
    public String getTitle() {
        return (String) get(1);
    }

    /**
     * Setter for <code>ateupeonding_core.tier.description</code>.
     */
    public void setDescription(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>ateupeonding_core.tier.description</code>.
     */
    public String getDescription() {
        return (String) get(2);
    }

    /**
     * Setter for <code>ateupeonding_core.tier.amount</code>.
     */
    public void setAmount(BigDecimal value) {
        set(3, value);
    }

    /**
     * Getter for <code>ateupeonding_core.tier.amount</code>.
     */
    public BigDecimal getAmount() {
        return (BigDecimal) get(3);
    }

    /**
     * Setter for <code>ateupeonding_core.tier.project_id</code>.
     */
    public void setProjectId(UUID value) {
        set(4, value);
    }

    /**
     * Getter for <code>ateupeonding_core.tier.project_id</code>.
     */
    public UUID getProjectId() {
        return (UUID) get(4);
    }

    /**
     * Setter for <code>ateupeonding_core.tier.created_timestamp</code>.
     */
    public void setCreatedTimestamp(OffsetDateTime value) {
        set(5, value);
    }

    /**
     * Getter for <code>ateupeonding_core.tier.created_timestamp</code>.
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
    public Row6<UUID, String, String, BigDecimal, UUID, OffsetDateTime> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    @Override
    public Row6<UUID, String, String, BigDecimal, UUID, OffsetDateTime> valuesRow() {
        return (Row6) super.valuesRow();
    }

    @Override
    public Field<UUID> field1() {
        return Tier.TIER.ID;
    }

    @Override
    public Field<String> field2() {
        return Tier.TIER.TITLE;
    }

    @Override
    public Field<String> field3() {
        return Tier.TIER.DESCRIPTION;
    }

    @Override
    public Field<BigDecimal> field4() {
        return Tier.TIER.AMOUNT;
    }

    @Override
    public Field<UUID> field5() {
        return Tier.TIER.PROJECT_ID;
    }

    @Override
    public Field<OffsetDateTime> field6() {
        return Tier.TIER.CREATED_TIMESTAMP;
    }

    @Override
    public UUID component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getTitle();
    }

    @Override
    public String component3() {
        return getDescription();
    }

    @Override
    public BigDecimal component4() {
        return getAmount();
    }

    @Override
    public UUID component5() {
        return getProjectId();
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
    public String value2() {
        return getTitle();
    }

    @Override
    public String value3() {
        return getDescription();
    }

    @Override
    public BigDecimal value4() {
        return getAmount();
    }

    @Override
    public UUID value5() {
        return getProjectId();
    }

    @Override
    public OffsetDateTime value6() {
        return getCreatedTimestamp();
    }

    @Override
    public TierRecord value1(UUID value) {
        setId(value);
        return this;
    }

    @Override
    public TierRecord value2(String value) {
        setTitle(value);
        return this;
    }

    @Override
    public TierRecord value3(String value) {
        setDescription(value);
        return this;
    }

    @Override
    public TierRecord value4(BigDecimal value) {
        setAmount(value);
        return this;
    }

    @Override
    public TierRecord value5(UUID value) {
        setProjectId(value);
        return this;
    }

    @Override
    public TierRecord value6(OffsetDateTime value) {
        setCreatedTimestamp(value);
        return this;
    }

    @Override
    public TierRecord values(UUID value1, String value2, String value3, BigDecimal value4, UUID value5, OffsetDateTime value6) {
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
     * Create a detached TierRecord
     */
    public TierRecord() {
        super(Tier.TIER);
    }

    /**
     * Create a detached, initialised TierRecord
     */
    public TierRecord(UUID id, String title, String description, BigDecimal amount, UUID projectId, OffsetDateTime createdTimestamp) {
        super(Tier.TIER);

        setId(id);
        setTitle(title);
        setDescription(description);
        setAmount(amount);
        setProjectId(projectId);
        setCreatedTimestamp(createdTimestamp);
    }
}
