package org.pedido.quarkus.dao.repository;

import org.pedido.quarkus.dao.model.ProductoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<ProductoEntity, Long> {
    boolean existsByNombre(String nombre);
}
