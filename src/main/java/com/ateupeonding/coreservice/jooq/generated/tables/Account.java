/*
 * This file is generated by jOOQ.
 */
package com.ateupeonding.coreservice.jooq.generated.tables;


import com.ateupeonding.coreservice.jooq.generated.AteupeondingCore;
import com.ateupeonding.coreservice.jooq.generated.Keys;
import com.ateupeonding.coreservice.jooq.generated.tables.records.AccountRecord;

import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import org.jooq.Field;
import org.jooq.ForeignKey;
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
public class Account extends TableImpl<AccountRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>ateupeonding_core.account</code>
     */
    public static final Account ACCOUNT = new Account();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AccountRecord> getRecordType() {
        return AccountRecord.class;
    }

    /**
     * The column <code>ateupeonding_core.account.id</code>.
     */
    public final TableField<AccountRecord, UUID> ID = createField(DSL.name("id"), SQLDataType.UUID.nullable(false).defaultValue(DSL.field("gen_random_uuid()", SQLDataType.UUID)), this, "");

    /**
     * The column <code>ateupeonding_core.account.fist_name</code>.
     */
    public final TableField<AccountRecord, String> FIST_NAME = createField(DSL.name("fist_name"), SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>ateupeonding_core.account.last_name</code>.
     */
    public final TableField<AccountRecord, String> LAST_NAME = createField(DSL.name("last_name"), SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>ateupeonding_core.account.email</code>.
     */
    public final TableField<AccountRecord, String> EMAIL = createField(DSL.name("email"), SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>ateupeonding_core.account.user_id</code>.
     */
    public final TableField<AccountRecord, UUID> USER_ID = createField(DSL.name("user_id"), SQLDataType.UUID.nullable(false), this, "");

    /**
     * The column <code>ateupeonding_core.account.created_timestamp</code>.
     */
    public final TableField<AccountRecord, OffsetDateTime> CREATED_TIMESTAMP = createField(DSL.name("created_timestamp"), SQLDataType.TIMESTAMPWITHTIMEZONE(6).defaultValue(DSL.field("now()", SQLDataType.TIMESTAMPWITHTIMEZONE)), this, "");

    private Account(Name alias, Table<AccountRecord> aliased) {
        this(alias, aliased, null);
    }

    private Account(Name alias, Table<AccountRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>ateupeonding_core.account</code> table reference
     */
    public Account(String alias) {
        this(DSL.name(alias), ACCOUNT);
    }

    /**
     * Create an aliased <code>ateupeonding_core.account</code> table reference
     */
    public Account(Name alias) {
        this(alias, ACCOUNT);
    }

    /**
     * Create a <code>ateupeonding_core.account</code> table reference
     */
    public Account() {
        this(DSL.name("account"), null);
    }

    public <O extends Record> Account(Table<O> child, ForeignKey<O, AccountRecord> key) {
        super(child, key, ACCOUNT);
    }

    @Override
    public Schema getSchema() {
        return AteupeondingCore.ATEUPEONDING_CORE;
    }

    @Override
    public UniqueKey<AccountRecord> getPrimaryKey() {
        return Keys.ACCOUNT_PKEY;
    }

    @Override
    public List<UniqueKey<AccountRecord>> getKeys() {
        return Arrays.<UniqueKey<AccountRecord>>asList(Keys.ACCOUNT_PKEY, Keys.ACCOUNT_USER_ID_KEY);
    }

    @Override
    public Account as(String alias) {
        return new Account(DSL.name(alias), this);
    }

    @Override
    public Account as(Name alias) {
        return new Account(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Account rename(String name) {
        return new Account(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Account rename(Name name) {
        return new Account(name, null);
    }

    // -------------------------------------------------------------------------
    // Row6 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row6<UUID, String, String, String, UUID, OffsetDateTime> fieldsRow() {
        return (Row6) super.fieldsRow();
    }
}
