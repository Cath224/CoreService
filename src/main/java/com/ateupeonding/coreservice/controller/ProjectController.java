package com.ateupeonding.coreservice.controller;

import com.ateupeonding.coreservice.jooq.generated.tables.pojos.Project;
import com.ateupeonding.coreservice.jooq.generated.tables.records.ProjectRecord;
import com.ateupeonding.coreservice.mapper.ProjectMapper;
import com.ateupeonding.coreservice.model.dto.ProjectDto;
import com.ateupeonding.coreservice.service.api.ProjectService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(ApiPaths.Project.PATH)
public class ProjectController extends EntityController<ProjectRecord, Project, ProjectDto> {

    public ProjectController(ProjectService service, ProjectMapper mapper) {
        super(service, mapper);
    }
}
