package org.pedido.quarkus.expose.dto;

import io.quarkus.runtime.annotations.RegisterForReflection;
import lombok.Getter;
import lombok.Setter;
import org.pedido.quarkus.dao.model.PersonaEntity;

import java.util.List;

public class UsuarioDto {
    @Getter
    @Setter
    @RegisterForReflection
    public static class Response{
        private Long usuarioId;
        private PersonaDto.Response persona;
        private String username;
        private String password;
        private String correoElectronico;
        private boolean estado;
        private UsuarioRolDto.Response usuarioRol;
    }

    @Getter
    @Setter
    public static class Request{
        private Long usuarioId;
        private PersonaDto.Request persona;
        private String username;
        private String password;
        private String correoElectronico;
        private boolean estado;
        private UsuarioRolDto.Request usuarioRol;
    }
}
