/*
 * This file is generated by jOOQ.
 */
package com.ateupeonding.coreservice.jooq.generated.tables;


import com.ateupeonding.coreservice.jooq.generated.AteupeondingCore;
import com.ateupeonding.coreservice.jooq.generated.Indexes;
import com.ateupeonding.coreservice.jooq.generated.Keys;
import com.ateupeonding.coreservice.jooq.generated.enums.PaymentStatus;
import com.ateupeonding.coreservice.jooq.generated.tables.records.UserGoalRecord;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row6;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UserGoal extends TableImpl<UserGoalRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>ateupeonding_core.user_goal</code>
     */
    public static final UserGoal USER_GOAL = new UserGoal();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<UserGoalRecord> getRecordType() {
        return UserGoalRecord.class;
    }

    /**
     * The column <code>ateupeonding_core.user_goal.id</code>.
     */
    public final TableField<UserGoalRecord, UUID> ID = createField(DSL.name("id"), SQLDataType.UUID.nullable(false).defaultValue(DSL.field("gen_random_uuid()", SQLDataType.UUID)), this, "");

    /**
     * The column <code>ateupeonding_core.user_goal.goal_id</code>.
     */
    public final TableField<UserGoalRecord, UUID> GOAL_ID = createField(DSL.name("goal_id"), SQLDataType.UUID.nullable(false), this, "");

    /**
     * The column <code>ateupeonding_core.user_goal.account_id</code>.
     */
    public final TableField<UserGoalRecord, UUID> ACCOUNT_ID = createField(DSL.name("account_id"), SQLDataType.UUID.nullable(false), this, "");

    /**
     * The column <code>ateupeonding_core.user_goal.amount</code>.
     */
    public final TableField<UserGoalRecord, BigDecimal> AMOUNT = createField(DSL.name("amount"), SQLDataType.NUMERIC.nullable(false), this, "");

    /**
     * The column <code>ateupeonding_core.user_goal.status</code>.
     */
    public final TableField<UserGoalRecord, PaymentStatus> STATUS = createField(DSL.name("status"), SQLDataType.VARCHAR.nullable(false).defaultValue(DSL.field("'IN_PROGRESS'::ateupeonding_core.payment_status", SQLDataType.VARCHAR)).asEnumDataType(com.ateupeonding.coreservice.jooq.generated.enums.PaymentStatus.class), this, "");

    /**
     * The column <code>ateupeonding_core.user_goal.created_timestamp</code>.
     */
    public final TableField<UserGoalRecord, OffsetDateTime> CREATED_TIMESTAMP = createField(DSL.name("created_timestamp"), SQLDataType.TIMESTAMPWITHTIMEZONE(6).defaultValue(DSL.field("now()", SQLDataType.TIMESTAMPWITHTIMEZONE)), this, "");

    private UserGoal(Name alias, Table<UserGoalRecord> aliased) {
        this(alias, aliased, null);
    }

    private UserGoal(Name alias, Table<UserGoalRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>ateupeonding_core.user_goal</code> table reference
     */
    public UserGoal(String alias) {
        this(DSL.name(alias), USER_GOAL);
    }

    /**
     * Create an aliased <code>ateupeonding_core.user_goal</code> table reference
     */
    public UserGoal(Name alias) {
        this(alias, USER_GOAL);
    }

    /**
     * Create a <code>ateupeonding_core.user_goal</code> table reference
     */
    public UserGoal() {
        this(DSL.name("user_goal"), null);
    }

    public <O extends Record> UserGoal(Table<O> child, ForeignKey<O, UserGoalRecord> key) {
        super(child, key, USER_GOAL);
    }

    @Override
    public Schema getSchema() {
        return AteupeondingCore.ATEUPEONDING_CORE;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.ATEUPEONDING_CORE_USER_GOAL_GOAL_ID_ACCOUNT_ID);
    }

    @Override
    public UniqueKey<UserGoalRecord> getPrimaryKey() {
        return Keys.USER_GOAL_PKEY;
    }

    @Override
    public List<UniqueKey<UserGoalRecord>> getKeys() {
        return Arrays.<UniqueKey<UserGoalRecord>>asList(Keys.USER_GOAL_PKEY);
    }

    @Override
    public List<ForeignKey<UserGoalRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<UserGoalRecord, ?>>asList(Keys.USER_GOAL__USER_GOAL_GOAL_ID_FKEY, Keys.USER_GOAL__USER_GOAL_ACCOUNT_ID_FKEY);
    }

    private transient Goal _goal;
    private transient Account _account;

    public Goal goal() {
        if (_goal == null)
            _goal = new Goal(this, Keys.USER_GOAL__USER_GOAL_GOAL_ID_FKEY);

        return _goal;
    }

    public Account account() {
        if (_account == null)
            _account = new Account(this, Keys.USER_GOAL__USER_GOAL_ACCOUNT_ID_FKEY);

        return _account;
    }

    @Override
    public UserGoal as(String alias) {
        return new UserGoal(DSL.name(alias), this);
    }

    @Override
    public UserGoal as(Name alias) {
        return new UserGoal(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public UserGoal rename(String name) {
        return new UserGoal(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public UserGoal rename(Name name) {
        return new UserGoal(name, null);
    }

    // -------------------------------------------------------------------------
    // Row6 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row6<UUID, UUID, UUID, BigDecimal, PaymentStatus, OffsetDateTime> fieldsRow() {
        return (Row6) super.fieldsRow();
    }
}