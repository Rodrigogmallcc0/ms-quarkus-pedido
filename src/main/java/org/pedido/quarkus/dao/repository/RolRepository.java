package org.pedido.quarkus.dao.repository;

import org.pedido.quarkus.dao.model.RolEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolRepository extends JpaRepository<RolEntity, Long> {
    boolean existsByNombreDelRol(String nombreDelRol);
}
