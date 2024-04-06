package org.pedido.quarkus.expose.dto;

import io.quarkus.runtime.annotations.RegisterForReflection;
import lombok.Getter;
import lombok.Setter;

public class RolDto {
    @Getter
    @Setter
    @RegisterForReflection
    public static class Response {
        private Long rolId;
        private String nombreDelRol;

    }

    @Getter
    @Setter
    public static class Request {
        private Long rolId;
        private String nombreDelRol;
    }
}
