/*
 * This file is generated by jOOQ.
 */
package com.ateupeonding.coreservice.jooq.generated.tables;


import com.ateupeonding.coreservice.jooq.generated.AteupeondingCore;
import com.ateupeonding.coreservice.jooq.generated.Indexes;
import com.ateupeonding.coreservice.jooq.generated.Keys;
import com.ateupeonding.coreservice.jooq.generated.enums.PaymentStatus;
import com.ateupeonding.coreservice.jooq.generated.tables.records.UserTierRecord;

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
public class UserTier extends TableImpl<UserTierRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>ateupeonding_core.user_tier</code>
     */
    public static final UserTier USER_TIER = new UserTier();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<UserTierRecord> getRecordType() {
        return UserTierRecord.class;
    }

    /**
     * The column <code>ateupeonding_core.user_tier.id</code>.
     */
    public final TableField<UserTierRecord, UUID> ID = createField(DSL.name("id"), SQLDataType.UUID.nullable(false).defaultValue(DSL.field("gen_random_uuid()", SQLDataType.UUID)), this, "");

    /**
     * The column <code>ateupeonding_core.user_tier.tier_id</code>.
     */
    public final TableField<UserTierRecord, UUID> TIER_ID = createField(DSL.name("tier_id"), SQLDataType.UUID.nullable(false), this, "");

    /**
     * The column <code>ateupeonding_core.user_tier.account_id</code>.
     */
    public final TableField<UserTierRecord, UUID> ACCOUNT_ID = createField(DSL.name("account_id"), SQLDataType.UUID.nullable(false), this, "");

    /**
     * The column <code>ateupeonding_core.user_tier.amount</code>.
     */
    public final TableField<UserTierRecord, BigDecimal> AMOUNT = createField(DSL.name("amount"), SQLDataType.NUMERIC.nullable(false), this, "");

    /**
     * The column <code>ateupeonding_core.user_tier.status</code>.
     */
    public final TableField<UserTierRecord, PaymentStatus> STATUS = createField(DSL.name("status"), SQLDataType.VARCHAR.nullable(false).defaultValue(DSL.field("'IN_PROGRESS'::ateupeonding_core.payment_status", SQLDataType.VARCHAR)).asEnumDataType(com.ateupeonding.coreservice.jooq.generated.enums.PaymentStatus.class), this, "");

    /**
     * The column <code>ateupeonding_core.user_tier.created_timestamp</code>.
     */
    public final TableField<UserTierRecord, OffsetDateTime> CREATED_TIMESTAMP = createField(DSL.name("created_timestamp"), SQLDataType.TIMESTAMPWITHTIMEZONE(6).defaultValue(DSL.field("now()", SQLDataType.TIMESTAMPWITHTIMEZONE)), this, "");

    private UserTier(Name alias, Table<UserTierRecord> aliased) {
        this(alias, aliased, null);
    }

    private UserTier(Name alias, Table<UserTierRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>ateupeonding_core.user_tier</code> table reference
     */
    public UserTier(String alias) {
        this(DSL.name(alias), USER_TIER);
    }

    /**
     * Create an aliased <code>ateupeonding_core.user_tier</code> table reference
     */
    public UserTier(Name alias) {
        this(alias, USER_TIER);
    }

    /**
     * Create a <code>ateupeonding_core.user_tier</code> table reference
     */
    public UserTier() {
        this(DSL.name("user_tier"), null);
    }

    public <O extends Record> UserTier(Table<O> child, ForeignKey<O, UserTierRecord> key) {
        super(child, key, USER_TIER);
    }

    @Override
    public Schema getSchema() {
        return AteupeondingCore.ATEUPEONDING_CORE;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.ATEUPEONDING_CORE_USER_TIER_TIER_ID_ACCOUNT_ID);
    }

    @Override
    public UniqueKey<UserTierRecord> getPrimaryKey() {
        return Keys.USER_TIER_PKEY;
    }

    @Override
    public List<UniqueKey<UserTierRecord>> getKeys() {
        return Arrays.<UniqueKey<UserTierRecord>>asList(Keys.USER_TIER_PKEY);
    }

    @Override
    public List<ForeignKey<UserTierRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<UserTierRecord, ?>>asList(Keys.USER_TIER__USER_TIER_TIER_ID_FKEY, Keys.USER_TIER__USER_TIER_ACCOUNT_ID_FKEY);
    }

    private transient Tier _tier;
    private transient Account _account;

    public Tier tier() {
        if (_tier == null)
            _tier = new Tier(this, Keys.USER_TIER__USER_TIER_TIER_ID_FKEY);

        return _tier;
    }

    public Account account() {
        if (_account == null)
            _account = new Account(this, Keys.USER_TIER__USER_TIER_ACCOUNT_ID_FKEY);

        return _account;
    }

    @Override
    public UserTier as(String alias) {
        return new UserTier(DSL.name(alias), this);
    }

    @Override
    public UserTier as(Name alias) {
        return new UserTier(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public UserTier rename(String name) {
        return new UserTier(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public UserTier rename(Name name) {
        return new UserTier(name, null);
    }

    // -------------------------------------------------------------------------
    // Row6 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row6<UUID, UUID, UUID, BigDecimal, PaymentStatus, OffsetDateTime> fieldsRow() {
        return (Row6) super.fieldsRow();
    }
}
