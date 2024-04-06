package org.pedido.quarkus.dao.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Getter
@Setter
@Table(name = "DetallePedido", schema = "quarkus")
public class DetallePedidoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long detalleId;
    private int stock;
    private BigDecimal precioUnitario;
    private BigDecimal totalD;

    @ManyToOne
    @JoinColumn(name = "pedido_id")
    private PedidoEntity pedido;

    @ManyToOne
    @JoinColumn(name = "producto_id")
    private ProductoEntity producto;

    private String archivoAdjunto;
}
