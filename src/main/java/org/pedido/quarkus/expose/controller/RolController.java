package org.pedido.quarkus.expose.controller;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.pedido.quarkus.bussines.service.RolService;
import org.pedido.quarkus.expose.dto.RolDto;

import java.util.List;

@Path("/rol")
public class RolController {

    @Inject
    RolService rolService;

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response saveRol(RolDto.Request request){
        RolDto.Response response = rolService.saveRol(request);
        return Response.ok(response).build();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAllRol(){
        List<RolDto.Response> response = rolService.getAllRol();
        return Response.ok(response).build();
    }
}
