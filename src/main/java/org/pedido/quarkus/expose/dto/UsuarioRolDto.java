package org.pedido.quarkus.expose.dto;

import io.quarkus.runtime.annotations.RegisterForReflection;
import lombok.Getter;
import lombok.Setter;

public class UsuarioRolDto {
    @Getter
    @Setter
    @RegisterForReflection
    public static class Response{
        private Long usuarioRolId;
        private UsuarioDto.Response usuario;
        private RolDto.Response rol;
    }
    @Getter
    @Setter
    public static class Request{
        private Long usuarioRolId;
        private RolDto.Request rol;
    }
}
