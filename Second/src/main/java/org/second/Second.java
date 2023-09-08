package org.second;

import org.eclipse.microprofile.jwt.Claim;
import org.eclipse.microprofile.jwt.Claims;

import jakarta.annotation.security.RolesAllowed;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/second")
public class Second {

    @Inject
    @Claim(standard = Claims.email)
    String email;

    @GET
    @Path("/getSum/{a}/{b}")
    @RolesAllowed({"Admin"})
    @Produces(MediaType.TEXT_PLAIN)
    public int getSum(@PathParam("a") int a, @PathParam("b") int b){
        return a + b;
    }
}
