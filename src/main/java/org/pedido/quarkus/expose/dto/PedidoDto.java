package org.pedido.quarkus.expose.dto;

import io.quarkus.runtime.annotations.RegisterForReflection;
import lombok.Getter;
import lombok.Setter;
import org.pedido.quarkus.dao.model.UsuarioEntity;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

public class PedidoDto {
    @Getter
    @Setter
    @RegisterForReflection
    public static class Response{
        private Long pedidoId;
        private LocalDate fecha;
        private BigDecimal totalP;
        private String estado;
        private UUID codigoProducto;
        private UsuarioEntity usuario;
        private List<DetallePedidoDto.Response> detalles;
    }
    @Getter
    @Setter
    public static class Request{
        private Long pedidoId;
        private LocalDate fecha;
        private BigDecimal totalP;
        private String estado;
        private UUID codigoProducto;
        private UsuarioEntity usuario;
        private List<DetallePedidoDto.Request> detalles;
    }
}
