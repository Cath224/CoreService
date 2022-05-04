package com.ateupeonding.coreservice.service.api;

import org.jooq.TableRecord;

import java.util.List;
import java.util.UUID;

public interface EntityService<R extends TableRecord<R>, P> {

    P create(P pojo);

    P update(P pojo);

    void deleteById(UUID id);

    List<P> get();

    P getById(UUID id);

}
