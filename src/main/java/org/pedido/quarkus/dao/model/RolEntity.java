package org.pedido.quarkus.dao.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Rol", schema = "quarkus")
public class RolEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long rolId;
    private String nombreDelRol;

    public Long getRolId() {
        return rolId;
    }

    public void setRolId(Long rolId) {
        this.rolId = rolId;
    }

    public String getNombreDelRol() {
        return nombreDelRol;
    }

    public void setNombreDelRol(String nombreDelRol) {
        this.nombreDelRol = nombreDelRol;
    }
}
