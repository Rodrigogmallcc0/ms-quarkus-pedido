package org.pedido.quarkus.mapper;

import org.mapstruct.Mapper;
import org.pedido.quarkus.dao.model.UsuarioEntity;
import org.pedido.quarkus.expose.dto.UsuarioDto;

import java.util.List;

@Mapper(componentModel = "cdi")
public interface UsuarioMapper {
    List<UsuarioDto.Response> toResponseList(List<UsuarioEntity> usuario);

    UsuarioDto.Response toResponse(UsuarioEntity usuario);

    UsuarioEntity toRequest(UsuarioDto.Request request);
}
