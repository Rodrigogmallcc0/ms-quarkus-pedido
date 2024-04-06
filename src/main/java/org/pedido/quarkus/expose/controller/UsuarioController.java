package org.pedido.quarkus.expose.controller;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.pedido.quarkus.bussines.service.UsuarioService;
import org.pedido.quarkus.expose.dto.PersonaDto;

import java.util.List;

@Path("/Persona")
public class UsuarioController {
    @Inject
    UsuarioService usuarioService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAllPerson(){
        List<PersonaDto.Response> response = usuarioService.getAllPerson();
        return Response.ok(response).build();
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response savePerson(List<PersonaDto.Request> requests){
        List<PersonaDto.Response> response = usuarioService.savePerson(requests);
        return Response.ok(response).build();
    }

}
