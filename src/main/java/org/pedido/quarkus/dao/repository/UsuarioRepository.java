package org.pedido.quarkus.dao.repository;

import org.pedido.quarkus.dao.model.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long> {
    boolean existsByusername(String username);

    Optional<UsuarioEntity> findById(Long usuarioId);

    Optional<UsuarioEntity> findByusername(String username);

   // @Query(value = "SELECT * FROM usuario", nativeQuery = true)
    //List<Usuario> seleccionarTodosLosUsuarios();
}
