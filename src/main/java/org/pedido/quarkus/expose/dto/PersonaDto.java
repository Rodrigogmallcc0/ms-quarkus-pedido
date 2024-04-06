package org.pedido.quarkus.expose.dto;

import io.quarkus.runtime.annotations.RegisterForReflection;
import lombok.Getter;
import lombok.Setter;

public class PersonaDto {
    @Getter
    @Setter
    @RegisterForReflection
    public static class Response{
    private Long personaId;
    private String nombre;
    private String direccion;
    private String tipoDocumento;
    private String numeroDocumento;
    }

    @Getter
    @Setter
    public static class Request{
        private Long personaId;
        private String nombre;
        private String direccion;
        private String tipoDocumento;
        private String numeroDocumento;
   }

}
