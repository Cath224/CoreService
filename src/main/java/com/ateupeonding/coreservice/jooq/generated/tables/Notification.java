/*
 * This file is generated by jOOQ.
 */
package com.ateupeonding.coreservice.jooq.generated.tables;


import com.ateupeonding.coreservice.jooq.generated.AteupeondingCore;
import com.ateupeonding.coreservice.jooq.generated.Indexes;
import com.ateupeonding.coreservice.jooq.generated.Keys;
import com.ateupeonding.coreservice.jooq.generated.tables.records.NotificationRecord;

import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row5;
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
public class Notification extends TableImpl<NotificationRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>ateupeonding_core.notification</code>
     */
    public static final Notification NOTIFICATION = new Notification();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<NotificationRecord> getRecordType() {
        return NotificationRecord.class;
    }

    /**
     * The column <code>ateupeonding_core.notification.id</code>.
     */
    public final TableField<NotificationRecord, UUID> ID = createField(DSL.name("id"), SQLDataType.UUID.nullable(false).defaultValue(DSL.field("gen_random_uuid()", SQLDataType.UUID)), this, "");

    /**
     * The column <code>ateupeonding_core.notification.title</code>.
     */
    public final TableField<NotificationRecord, String> TITLE = createField(DSL.name("title"), SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>ateupeonding_core.notification.description</code>.
     */
    public final TableField<NotificationRecord, String> DESCRIPTION = createField(DSL.name("description"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>ateupeonding_core.notification.account_id</code>.
     */
    public final TableField<NotificationRecord, UUID> ACCOUNT_ID = createField(DSL.name("account_id"), SQLDataType.UUID.nullable(false), this, "");

    /**
     * The column <code>ateupeonding_core.notification.created_timestamp</code>.
     */
    public final TableField<NotificationRecord, OffsetDateTime> CREATED_TIMESTAMP = createField(DSL.name("created_timestamp"), SQLDataType.TIMESTAMPWITHTIMEZONE(6).defaultValue(DSL.field("now()", SQLDataType.TIMESTAMPWITHTIMEZONE)), this, "");

    private Notification(Name alias, Table<NotificationRecord> aliased) {
        this(alias, aliased, null);
    }

    private Notification(Name alias, Table<NotificationRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>ateupeonding_core.notification</code> table reference
     */
    public Notification(String alias) {
        this(DSL.name(alias), NOTIFICATION);
    }

    /**
     * Create an aliased <code>ateupeonding_core.notification</code> table reference
     */
    public Notification(Name alias) {
        this(alias, NOTIFICATION);
    }

    /**
     * Create a <code>ateupeonding_core.notification</code> table reference
     */
    public Notification() {
        this(DSL.name("notification"), null);
    }

    public <O extends Record> Notification(Table<O> child, ForeignKey<O, NotificationRecord> key) {
        super(child, key, NOTIFICATION);
    }

    @Override
    public Schema getSchema() {
        return AteupeondingCore.ATEUPEONDING_CORE;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.ATEUPEONDING_CORE_NOTIFICATION_ACCOUNT_ID);
    }

    @Override
    public UniqueKey<NotificationRecord> getPrimaryKey() {
        return Keys.NOTIFICATION_PKEY;
    }

    @Override
    public List<UniqueKey<NotificationRecord>> getKeys() {
        return Arrays.<UniqueKey<NotificationRecord>>asList(Keys.NOTIFICATION_PKEY);
    }

    @Override
    public List<ForeignKey<NotificationRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<NotificationRecord, ?>>asList(Keys.NOTIFICATION__NOTIFICATION_ACCOUNT_ID_FKEY);
    }

    private transient Account _account;

    public Account account() {
        if (_account == null)
            _account = new Account(this, Keys.NOTIFICATION__NOTIFICATION_ACCOUNT_ID_FKEY);

        return _account;
    }

    @Override
    public Notification as(String alias) {
        return new Notification(DSL.name(alias), this);
    }

    @Override
    public Notification as(Name alias) {
        return new Notification(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Notification rename(String name) {
        return new Notification(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Notification rename(Name name) {
        return new Notification(name, null);
    }

    // -------------------------------------------------------------------------
    // Row5 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row5<UUID, String, String, UUID, OffsetDateTime> fieldsRow() {
        return (Row5) super.fieldsRow();
    }
}
