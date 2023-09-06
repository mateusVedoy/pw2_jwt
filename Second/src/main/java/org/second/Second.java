package org.second;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/second")
public class Second {

    @GET
    @Path("/getSum/{a}/{b}")
    @Produces(MediaType.TEXT_PLAIN)
    public int getSum(@PathParam("a") int a, @PathParam("b") int b){
        return a + b;
    }
}
