package com.ateupeonding.coreservice.service.impl;

import com.ateupeonding.coreservice.dao.api.EntityDao;
import com.ateupeonding.coreservice.service.api.EntityService;
import org.jooq.TableRecord;

import java.util.List;
import java.util.UUID;

public abstract class EntityServiceImpl<R extends TableRecord<R>, P> implements EntityService<R, P> {

    private final EntityDao<R, P> dao;

    protected EntityServiceImpl(EntityDao<R, P> dao) {
        this.dao = dao;
    }

    @Override
    public P create(P pojo) {
        dao.insert(pojo);
        return pojo;
    }

    @Override
    public P update(P pojo) {
        dao.update(pojo);
        return pojo;
    }

    @Override
    public void deleteById(UUID id) {
        dao.deleteById(id);
    }

    @Override
    public List<P> get() {
        return dao.findAll();
    }

    @Override
    public P getById(UUID id) {
        return dao.findById(id);
    }
}
