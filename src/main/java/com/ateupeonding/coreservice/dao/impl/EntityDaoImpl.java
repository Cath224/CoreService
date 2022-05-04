package com.ateupeonding.coreservice.dao.impl;

import com.ateupeonding.coreservice.dao.api.EntityDao;
import org.jooq.Configuration;
import org.jooq.Table;
import org.jooq.UpdatableRecord;
import org.jooq.impl.DAOImpl;

import java.util.Collection;
import java.util.UUID;

public abstract class EntityDaoImpl<R extends UpdatableRecord<R>, P> extends DAOImpl<R, P, UUID> implements EntityDao<R, P> {

    protected EntityDaoImpl(Configuration configuration, Table<R> table, Class<P> type) {
        super(table, type, configuration);
    }
}
