package com.ateupeonding.coreservice.controller;

import com.ateupeonding.coreservice.mapper.EntityMapper;
import com.ateupeonding.coreservice.model.dto.EntityDto;
import com.ateupeonding.coreservice.service.api.EntityService;
import org.jooq.TableRecord;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

public abstract class EntityController<R extends TableRecord<R>, P, D extends EntityDto> {


    private final EntityService<R, P> service;
    private final EntityMapper<P, D> mapper;


    protected EntityController(EntityService<R, P> service, EntityMapper<P, D> mapper) {
        this.service = service;
        this.mapper = mapper;
    }

    @PostMapping
    public D create(@RequestBody D dto) {
        return mapper.toDto(service.create(mapper.toEntity(dto)));
    }


    @PutMapping("{id}")
    public D update(@PathVariable String id, @RequestBody D dto) {
        dto.setId(parseIdToUUID(id));
        return mapper.toDto(service.update(mapper.toEntity(dto)));
    }

    @DeleteMapping("{id}")
    public void deleteById(@PathVariable String id) {
        UUID parsedId = parseIdToUUID(id);
        service.deleteById(parsedId);
    }

    @GetMapping
    public List<D> get() {
        return service.get().stream()
                .map(mapper::toDto)
                .collect(Collectors.toList());
    }

    @GetMapping("{id}")
    public D getById(@PathVariable String id) {
        return mapper.toDto(service.getById(parseIdToUUID(id)));
    }


    protected UUID parseIdToUUID(String id) {
      return ControllerUtils.parseIdToUUID(id);
    }

}
