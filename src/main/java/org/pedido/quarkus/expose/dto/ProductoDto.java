package org.pedido.quarkus.expose.dto;

import io.quarkus.runtime.annotations.RegisterForReflection;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.UUID;

public class ProductoDto {
    @Getter
    @Setter
    @RegisterForReflection
    public static class Response{
        private Long productoId;
        private String nombre;
        private String descripcion;
        private BigDecimal precio;
        private int stockP;
        private UUID codigoUuid;
        private String urlArchivo;
    }

    @Getter
    @Setter
    public static class Request{
        private Long productoId;
        private String nombre;
        private String descripcion;
        private BigDecimal precio;
        private int stockP;
        private UUID codigoUuid;
        private String urlArchivo;
    }
}
