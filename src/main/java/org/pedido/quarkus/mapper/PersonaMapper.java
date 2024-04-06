package org.pedido.quarkus.mapper;

import org.mapstruct.Mapper;
import org.pedido.quarkus.dao.model.PersonaEntity;
import org.pedido.quarkus.expose.dto.PersonaDto;

import java.util.List;

@Mapper(componentModel = "cdi")
public interface PersonaMapper {
    List<PersonaDto.Response> toResponseList(List<PersonaEntity> persona);

    PersonaDto.Response toResponse(PersonaEntity persona);

    PersonaEntity toRequest(PersonaDto.Request request);
}
