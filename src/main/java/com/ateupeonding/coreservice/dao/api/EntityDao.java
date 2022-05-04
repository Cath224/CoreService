package com.ateupeonding.coreservice.dao.api;

import org.jooq.DAO;
import org.jooq.TableRecord;

import java.util.UUID;

public interface EntityDao<R extends TableRecord<R>, P> extends DAO<R, P, UUID> {

}
