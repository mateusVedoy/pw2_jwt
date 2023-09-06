package org.acme;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;

@Path("/first")
public class First {

    @GET
    @Path("/sum/{a}/{b}")
    public int sum(@PathParam("a") int a, @PathParam("b") int b) {
        return a + b;
    }
}
