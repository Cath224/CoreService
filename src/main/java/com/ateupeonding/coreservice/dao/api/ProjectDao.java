package com.ateupeonding.coreservice.dao.api;

import com.ateupeonding.coreservice.jooq.generated.tables.pojos.Project;
import com.ateupeonding.coreservice.jooq.generated.tables.records.ProjectRecord;

public interface ProjectDao extends EntityDao<ProjectRecord, Project> {
}
