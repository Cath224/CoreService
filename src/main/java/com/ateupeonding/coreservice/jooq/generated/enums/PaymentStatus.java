/*
 * This file is generated by jOOQ.
 */
package com.ateupeonding.coreservice.jooq.generated.enums;


import com.ateupeonding.coreservice.jooq.generated.AteupeondingCore;

import org.jooq.Catalog;
import org.jooq.EnumType;
import org.jooq.Schema;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public enum PaymentStatus implements EnumType {

    IN_PROGRESS("IN_PROGRESS"),

    PAYED("PAYED"),

    DENIED("DENIED");

    private final String literal;

    private PaymentStatus(String literal) {
        this.literal = literal;
    }

    @Override
    public Catalog getCatalog() {
        return getSchema().getCatalog();
    }

    @Override
    public Schema getSchema() {
        return AteupeondingCore.ATEUPEONDING_CORE;
    }

    @Override
    public String getName() {
        return "payment_status";
    }

    @Override
    public String getLiteral() {
        return literal;
    }
}