package org.pedido.quarkus.bussines.service;

import org.pedido.quarkus.expose.dto.PersonaDto;
import org.pedido.quarkus.expose.dto.UsuarioDto;

import java.util.List;

public interface UsuarioService {
    List<PersonaDto.Response> savePerson(List<PersonaDto.Request> requests);
    List<PersonaDto.Response> getAllPerson();

    UsuarioDto.Response saveUsuario(UsuarioDto.Request request);

}
