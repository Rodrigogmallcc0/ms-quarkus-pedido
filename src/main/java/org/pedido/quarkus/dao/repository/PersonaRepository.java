package org.pedido.quarkus.dao.repository;

import org.pedido.quarkus.dao.model.PersonaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaRepository extends JpaRepository<PersonaEntity, Long> {
    boolean existsByNumeroDocumento(String numDoc);
}
