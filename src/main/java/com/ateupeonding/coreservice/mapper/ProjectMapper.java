package com.ateupeonding.coreservice.mapper;

import com.ateupeonding.coreservice.jooq.generated.tables.pojos.Project;
import com.ateupeonding.coreservice.model.dto.ProjectDto;
import org.mapstruct.Mapper;

@Mapper(config = EntityMapper.class)
public abstract class ProjectMapper implements EntityMapper<Project, ProjectDto> {
}
