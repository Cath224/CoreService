package com.ateupeonding.coreservice.mapper;

import com.ateupeonding.coreservice.model.dto.EntityDto;
import org.mapstruct.MapperConfig;

@MapperConfig(componentModel = "spring")
public interface EntityMapper<P, D extends EntityDto> {

    P toEntity(D dto);

    D toDto(P pojo);

}
