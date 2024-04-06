package org.pedido.quarkus.mapper;

import org.mapstruct.Mapper;
import org.pedido.quarkus.dao.model.UsuarioEntity;
import org.pedido.quarkus.dao.model.UsuarioRolEntity;
import org.pedido.quarkus.expose.dto.UsuarioDto;
import org.pedido.quarkus.expose.dto.UsuarioRolDto;

import java.util.List;

@Mapper(componentModel = "cdi")
public interface UsuarioRolMapper {
    List<UsuarioRolDto.Response> toResponseList(List<UsuarioRolEntity> usuarioRol);

    UsuarioRolDto.Response toResponse(UsuarioRolEntity usuarioRol);

    UsuarioRolEntity toRequest(UsuarioRolDto.Request request);
}
