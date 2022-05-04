package com.ateupeonding.coreservice.service.impl;

import com.ateupeonding.coreservice.dao.api.ProjectDao;
import com.ateupeonding.coreservice.jooq.generated.tables.pojos.Project;
import com.ateupeonding.coreservice.jooq.generated.tables.records.ProjectRecord;
import com.ateupeonding.coreservice.service.api.ProjectService;
import org.springframework.stereotype.Service;

@Service
public class ProjectServiceImpl extends EntityServiceImpl<ProjectRecord, Project> implements ProjectService {
    public ProjectServiceImpl(ProjectDao dao) {
        super(dao);
    }
}
