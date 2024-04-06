package org.pedido.quarkus.dao.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.UUID;

@Entity
@Getter
@Setter
@Table(name = "Producto", schema = "quarkus")
public class ProductoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productoId;
    private String nombre;
    private String descripcion;
    private BigDecimal precio;
    private int stockP;
    private UUID codigoUuid;
    private String urlArchivo;
}
