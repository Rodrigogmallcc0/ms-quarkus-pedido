package org.pedido.quarkus.bussines.serviceImpl;

import jakarta.enterprise.context.ApplicationScoped;
import lombok.RequiredArgsConstructor;
import org.pedido.quarkus.bussines.service.UsuarioService;
import org.pedido.quarkus.dao.model.PersonaEntity;
import org.pedido.quarkus.dao.model.RolEntity;
import org.pedido.quarkus.dao.model.UsuarioEntity;
import org.pedido.quarkus.dao.model.UsuarioRolEntity;
import org.pedido.quarkus.dao.repository.PersonaRepository;
import org.pedido.quarkus.dao.repository.RolRepository;
import org.pedido.quarkus.dao.repository.UsuarioRepository;
import org.pedido.quarkus.dao.repository.UsuarioRolRepository;
import org.pedido.quarkus.expose.dto.PersonaDto;
import org.pedido.quarkus.expose.dto.UsuarioDto;
import org.pedido.quarkus.mapper.PersonaMapper;
import org.pedido.quarkus.mapper.UsuarioMapper;
import org.pedido.quarkus.mapper.UsuarioRolMapper;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@ApplicationScoped
@RequiredArgsConstructor
public class UsuarioServiceImpl implements UsuarioService {

    private final PersonaRepository personaRepository;
    private final UsuarioRepository usuarioRepository;
    private final UsuarioRolRepository usuarioRolRepository;
    private final RolRepository rolesRepository;

    private final UsuarioMapper usuarioMapper;
    private final PersonaMapper personaMapper;
    private final UsuarioRolMapper usuarioRolMapper;

    @Override
    public List<PersonaDto.Response> savePerson(List<PersonaDto.Request> requests) {
        List<PersonaDto.Response> responses = new ArrayList<>();
        for (PersonaDto.Request request :requests){
            PersonaEntity persona = personaMapper.toRequest(request);
            personaRepository.save(persona);
        }
        return responses;
    }

    @Override
    public List<PersonaDto.Response> getAllPerson() {
        return personaMapper.toResponseList(personaRepository.findAll());
    }

    @Override
    public UsuarioDto.Response saveUsuario(UsuarioDto.Request request) {
        UsuarioDto.Response response = new UsuarioDto.Response();
        if (!usuarioRepository.existsByusername(request.getUsername())) {

            PersonaEntity persona = personaMapper.toRequest(request.getPersona());
            PersonaEntity savePerson = personaRepository.save(persona);

            UsuarioEntity user = usuarioMapper.toRequest(request);
            user.setEstado(true);
            user.setPersona(savePerson);
            UsuarioEntity saveUser = usuarioRepository.save(user);

            Optional<RolEntity> rolEntityOptional= rolesRepository.findById(request.getUsuarioRol().getRol().getRolId());
            if (rolEntityOptional.isPresent()) {
                UsuarioRolEntity usuarioRolEntity = new UsuarioRolEntity();
                usuarioRolEntity.setRol(rolEntityOptional.get());
                usuarioRolEntity.setUsuario(saveUser);
                UsuarioRolEntity saveUserRol = usuarioRolRepository.save(usuarioRolEntity);

                response.setUsuarioRol(usuarioRolMapper.toResponse(saveUserRol));
            }
            response.setUsuarioId(saveUser.getUsuarioId());
            response.setUsername(saveUser.getUsername());
            response.setPersona(personaMapper.toResponse(savePerson));

        }
        return response;
    }
}
