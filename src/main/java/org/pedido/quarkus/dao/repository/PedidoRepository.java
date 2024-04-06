package org.pedido.quarkus.dao.repository;

import org.pedido.quarkus.dao.model.PedidoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<PedidoEntity, Long> {
}
