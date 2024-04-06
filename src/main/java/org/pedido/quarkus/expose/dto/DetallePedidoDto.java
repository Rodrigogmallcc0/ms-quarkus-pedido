package org.pedido.quarkus.expose.dto;

import io.quarkus.runtime.annotations.RegisterForReflection;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

public class DetallePedidoDto {
    @Getter
    @Setter
    @RegisterForReflection
    public static class Response{
        private Long detalleId;
        private int stock;
        private BigDecimal precioUnitario;
        private BigDecimal totalD;
        private ProductoDto.Response producto;
        private String archivoAdjunto;
    }
    @Getter
    @Setter
    public static class Request{
        private Long detalleId;
        private int stock;
        private BigDecimal precioUnitario;
        private BigDecimal totalD;
        private ProductoDto.Request producto;
        private String archivoAdjunto;
    }
}
