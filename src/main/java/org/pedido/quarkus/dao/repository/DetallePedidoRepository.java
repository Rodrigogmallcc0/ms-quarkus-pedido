package org.pedido.quarkus.dao.repository;

import org.pedido.quarkus.dao.model.DetallePedidoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DetallePedidoRepository extends JpaRepository<DetallePedidoEntity, Long> {
}
