package org.acme;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RegisterRestClient()
public interface ISecond {

    @GET
    @Path("/second/getSum/{a}/{b}")
    @Produces(MediaType.TEXT_PLAIN)
    int getSum(@PathParam("a") int a, @PathParam("b") int b);

}
