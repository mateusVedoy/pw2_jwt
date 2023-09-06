package org.acme;

import java.util.Arrays;
import java.util.HashSet;

import org.eclipse.microprofile.jwt.Claims;

import io.smallrye.jwt.build.Jwt;
import jakarta.annotation.security.PermitAll;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/auth")
public class Authentication {

    @GET
    @PermitAll
    @Produces(MediaType.TEXT_PLAIN)
    public String generate() {
        return Jwt.issuer("http://127.0.0.1:8080")
        .upn("mateusvedoy@compiler.dev")
        .groups(new HashSet<>(Arrays.asList("User", "Admin")))
        .claim(Claims.email, "mateusvedoy@compiler.dev")
        .sign();
    }
}