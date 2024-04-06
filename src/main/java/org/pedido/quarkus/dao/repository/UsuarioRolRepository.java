package org.pedido.quarkus.dao.repository;

import org.pedido.quarkus.dao.model.UsuarioRolEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRolRepository extends JpaRepository<UsuarioRolEntity, Long> {
}
