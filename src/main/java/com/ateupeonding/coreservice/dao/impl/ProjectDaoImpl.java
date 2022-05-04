package com.ateupeonding.coreservice.dao.impl;

import com.ateupeonding.coreservice.dao.api.ProjectDao;
import com.ateupeonding.coreservice.jooq.generated.tables.pojos.Project;
import com.ateupeonding.coreservice.jooq.generated.tables.records.ProjectRecord;
import org.jooq.Configuration;
import org.springframework.stereotype.Repository;

import java.util.UUID;


@Repository
public class ProjectDaoImpl extends EntityDaoImpl<ProjectRecord, Project> implements ProjectDao {

    public ProjectDaoImpl(Configuration configuration) {
        super(configuration, com.ateupeonding.coreservice.jooq.generated.tables.Project.PROJECT, Project.class);
    }

    @Override
    public UUID getId(Project object) {
        return object.getId();
    }
}
