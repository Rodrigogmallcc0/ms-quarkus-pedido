package org.pedido.quarkus.bussines.serviceImpl;

import jakarta.enterprise.context.ApplicationScoped;
import lombok.RequiredArgsConstructor;
import org.pedido.quarkus.bussines.service.RolService;
import org.pedido.quarkus.expose.dto.RolDto;
import org.pedido.quarkus.mapper.RolMapper;
import org.pedido.quarkus.dao.model.RolEntity;
import org.pedido.quarkus.dao.repository.RolRepository;

import java.util.List;

@ApplicationScoped
@RequiredArgsConstructor
public class RolServiceImpl implements RolService {

private final RolMapper rolMapper;
private final RolRepository rolRepository;
    @Override
    public RolDto.Response saveRol(RolDto.Request request) {
        RolEntity rol = rolMapper.toRequest(request);
        RolEntity savedRol = rolRepository.save(rol);

        return rolMapper.toResponse(savedRol);
    }

    @Override
    public List<RolDto.Response> getAllRol() {
        List<RolEntity> rol= rolRepository.findAll();
        return  rolMapper.toResponseList(rol);
    }
}
