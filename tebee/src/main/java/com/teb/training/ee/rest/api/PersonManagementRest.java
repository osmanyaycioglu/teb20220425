package com.teb.training.ee.rest.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;

@Path("/api/v1/person/management")
public class PersonManagementRest {

    @Path("/change/address")
    @GET
    public String activatePerson(@QueryParam("add") final String address) {
        return "OK";
    }

    @Path("/purge/{pid}")
    @GET
    public String purgePerson(@PathParam("pid") final Long personId) {
        return "OK";
    }

}
