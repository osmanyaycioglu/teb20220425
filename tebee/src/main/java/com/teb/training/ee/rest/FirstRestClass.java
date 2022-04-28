package com.teb.training.ee.rest;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.PATCH;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;


@Path("/first")
@Produces("text/plain")
public class FirstRestClass {

    // /tebee/api/first/hello GET methodu attığımda çalış
    @Path("/hello")
    @GET
    public String hello() {
        return "Hello from Rest";
    }

    // /tebee/api/first/hello POST methodu attığımda çalış
    @Path("/hello")
    @POST
    public String helloPost() {
        return "Hello from Rest - POST";
    }

    @Path("/hello")
    @PUT
    public String helloPut() {
        return "Hello from Rest - PUT";
    }

    @Path("/hello")
    @PATCH
    public String helloPatch() {
        return "Hello from Rest - PATCH";
    }

    @Path("/hello")
    @DELETE
    public String helloDelete() {
        return "Hello from Rest - DELETE";
    }

}
