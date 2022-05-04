/*
 * This file is generated by jOOQ.
 */
package com.ateupeonding.coreservice.jooq.generated.tables.records;


import com.ateupeonding.coreservice.jooq.generated.tables.Goal;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class GoalRecord extends UpdatableRecordImpl<GoalRecord> implements Record5<UUID, String, BigDecimal, UUID, OffsetDateTime> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>ateupeonding_core.goal.id</code>.
     */
    public void setId(UUID value) {
        set(0, value);
    }

    /**
     * Getter for <code>ateupeonding_core.goal.id</code>.
     */
    public UUID getId() {
        return (UUID) get(0);
    }

    /**
     * Setter for <code>ateupeonding_core.goal.title</code>.
     */
    public void setTitle(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>ateupeonding_core.goal.title</code>.
     */
    public String getTitle() {
        return (String) get(1);
    }

    /**
     * Setter for <code>ateupeonding_core.goal.amount</code>.
     */
    public void setAmount(BigDecimal value) {
        set(2, value);
    }

    /**
     * Getter for <code>ateupeonding_core.goal.amount</code>.
     */
    public BigDecimal getAmount() {
        return (BigDecimal) get(2);
    }

    /**
     * Setter for <code>ateupeonding_core.goal.project_id</code>.
     */
    public void setProjectId(UUID value) {
        set(3, value);
    }

    /**
     * Getter for <code>ateupeonding_core.goal.project_id</code>.
     */
    public UUID getProjectId() {
        return (UUID) get(3);
    }

    /**
     * Setter for <code>ateupeonding_core.goal.created_timestamp</code>.
     */
    public void setCreatedTimestamp(OffsetDateTime value) {
        set(4, value);
    }

    /**
     * Getter for <code>ateupeonding_core.goal.created_timestamp</code>.
     */
    public OffsetDateTime getCreatedTimestamp() {
        return (OffsetDateTime) get(4);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<UUID> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row5<UUID, String, BigDecimal, UUID, OffsetDateTime> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    @Override
    public Row5<UUID, String, BigDecimal, UUID, OffsetDateTime> valuesRow() {
        return (Row5) super.valuesRow();
    }

    @Override
    public Field<UUID> field1() {
        return Goal.GOAL.ID;
    }

    @Override
    public Field<String> field2() {
        return Goal.GOAL.TITLE;
    }

    @Override
    public Field<BigDecimal> field3() {
        return Goal.GOAL.AMOUNT;
    }

    @Override
    public Field<UUID> field4() {
        return Goal.GOAL.PROJECT_ID;
    }

    @Override
    public Field<OffsetDateTime> field5() {
        return Goal.GOAL.CREATED_TIMESTAMP;
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
    public BigDecimal component3() {
        return getAmount();
    }

    @Override
    public UUID component4() {
        return getProjectId();
    }

    @Override
    public OffsetDateTime component5() {
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
    public BigDecimal value3() {
        return getAmount();
    }

    @Override
    public UUID value4() {
        return getProjectId();
    }

    @Override
    public OffsetDateTime value5() {
        return getCreatedTimestamp();
    }

    @Override
    public GoalRecord value1(UUID value) {
        setId(value);
        return this;
    }

    @Override
    public GoalRecord value2(String value) {
        setTitle(value);
        return this;
    }

    @Override
    public GoalRecord value3(BigDecimal value) {
        setAmount(value);
        return this;
    }

    @Override
    public GoalRecord value4(UUID value) {
        setProjectId(value);
        return this;
    }

    @Override
    public GoalRecord value5(OffsetDateTime value) {
        setCreatedTimestamp(value);
        return this;
    }

    @Override
    public GoalRecord values(UUID value1, String value2, BigDecimal value3, UUID value4, OffsetDateTime value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached GoalRecord
     */
    public GoalRecord() {
        super(Goal.GOAL);
    }

    /**
     * Create a detached, initialised GoalRecord
     */
    public GoalRecord(UUID id, String title, BigDecimal amount, UUID projectId, OffsetDateTime createdTimestamp) {
        super(Goal.GOAL);

        setId(id);
        setTitle(title);
        setAmount(amount);
        setProjectId(projectId);
        setCreatedTimestamp(createdTimestamp);
    }
}
