package org.acme;

import org.eclipse.microprofile.rest.client.inject.RestClient;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;

@Path("/first")
public class First {

    @Inject
    @RestClient
    ISecond second;

    @GET
    @Path("/sum/{a}/{b}")
    public int sum(@PathParam("a") int a, @PathParam("b") int b) {
        return second.getSum(a, b);
    }
}
