/*
 * This file is generated by jOOQ.
 */
package com.ateupeonding.coreservice.jooq.generated.tables;


import com.ateupeonding.coreservice.jooq.generated.AteupeondingCore;
import com.ateupeonding.coreservice.jooq.generated.Indexes;
import com.ateupeonding.coreservice.jooq.generated.Keys;
import com.ateupeonding.coreservice.jooq.generated.tables.records.TierRecord;

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
public class Tier extends TableImpl<TierRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>ateupeonding_core.tier</code>
     */
    public static final Tier TIER = new Tier();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TierRecord> getRecordType() {
        return TierRecord.class;
    }

    /**
     * The column <code>ateupeonding_core.tier.id</code>.
     */
    public final TableField<TierRecord, UUID> ID = createField(DSL.name("id"), SQLDataType.UUID.nullable(false).defaultValue(DSL.field("gen_random_uuid()", SQLDataType.UUID)), this, "");

    /**
     * The column <code>ateupeonding_core.tier.title</code>.
     */
    public final TableField<TierRecord, String> TITLE = createField(DSL.name("title"), SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>ateupeonding_core.tier.description</code>.
     */
    public final TableField<TierRecord, String> DESCRIPTION = createField(DSL.name("description"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>ateupeonding_core.tier.amount</code>.
     */
    public final TableField<TierRecord, BigDecimal> AMOUNT = createField(DSL.name("amount"), SQLDataType.NUMERIC.nullable(false), this, "");

    /**
     * The column <code>ateupeonding_core.tier.project_id</code>.
     */
    public final TableField<TierRecord, UUID> PROJECT_ID = createField(DSL.name("project_id"), SQLDataType.UUID.nullable(false), this, "");

    /**
     * The column <code>ateupeonding_core.tier.created_timestamp</code>.
     */
    public final TableField<TierRecord, OffsetDateTime> CREATED_TIMESTAMP = createField(DSL.name("created_timestamp"), SQLDataType.TIMESTAMPWITHTIMEZONE(6).defaultValue(DSL.field("now()", SQLDataType.TIMESTAMPWITHTIMEZONE)), this, "");

    private Tier(Name alias, Table<TierRecord> aliased) {
        this(alias, aliased, null);
    }

    private Tier(Name alias, Table<TierRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>ateupeonding_core.tier</code> table reference
     */
    public Tier(String alias) {
        this(DSL.name(alias), TIER);
    }

    /**
     * Create an aliased <code>ateupeonding_core.tier</code> table reference
     */
    public Tier(Name alias) {
        this(alias, TIER);
    }

    /**
     * Create a <code>ateupeonding_core.tier</code> table reference
     */
    public Tier() {
        this(DSL.name("tier"), null);
    }

    public <O extends Record> Tier(Table<O> child, ForeignKey<O, TierRecord> key) {
        super(child, key, TIER);
    }

    @Override
    public Schema getSchema() {
        return AteupeondingCore.ATEUPEONDING_CORE;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.ATEUPEONDING_CORE_TIER_PROJECT_ID);
    }

    @Override
    public UniqueKey<TierRecord> getPrimaryKey() {
        return Keys.TIER_PKEY;
    }

    @Override
    public List<UniqueKey<TierRecord>> getKeys() {
        return Arrays.<UniqueKey<TierRecord>>asList(Keys.TIER_PKEY);
    }

    @Override
    public List<ForeignKey<TierRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<TierRecord, ?>>asList(Keys.TIER__TIER_PROJECT_ID_FKEY);
    }

    private transient Project _project;

    public Project project() {
        if (_project == null)
            _project = new Project(this, Keys.TIER__TIER_PROJECT_ID_FKEY);

        return _project;
    }

    @Override
    public Tier as(String alias) {
        return new Tier(DSL.name(alias), this);
    }

    @Override
    public Tier as(Name alias) {
        return new Tier(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Tier rename(String name) {
        return new Tier(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Tier rename(Name name) {
        return new Tier(name, null);
    }

    // -------------------------------------------------------------------------
    // Row6 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row6<UUID, String, String, BigDecimal, UUID, OffsetDateTime> fieldsRow() {
        return (Row6) super.fieldsRow();
    }
}
