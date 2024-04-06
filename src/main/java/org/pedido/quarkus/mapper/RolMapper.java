package org.pedido.quarkus.mapper;

import org.mapstruct.Mapper;
import org.pedido.quarkus.expose.dto.RolDto;
import org.pedido.quarkus.dao.model.RolEntity;

import java.util.List;

@Mapper(componentModel = "cdi")
public interface RolMapper {

    List<RolDto.Response> toResponseList(List<RolEntity> model);

    RolDto.Response toResponse(RolEntity model);

    RolEntity toRequest(RolDto.Request request);
}
