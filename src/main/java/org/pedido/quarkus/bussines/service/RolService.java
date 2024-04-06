package org.pedido.quarkus.bussines.service;

import org.pedido.quarkus.expose.dto.RolDto;

import java.util.List;

public interface RolService {

    RolDto.Response saveRol(RolDto.Request request);
    List<RolDto.Response> getAllRol();
}
