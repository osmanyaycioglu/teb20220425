package com.teb.training.ee.rest.api;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import com.teb.training.ee.rest.Person;

@Path("/api/v1/person/provision")
@Valid
public class PersonProvisionRest {

    @Path("/activate")
    @POST
    public String activatePerson(@Valid final Person personParam) {
        return "OK";
    }

    @Path("/deactivate/{pid}")
    @GET
    public String deactivatePerson(@NotNull @Positive @PathParam("pid") final Long personId) {
        if (personId == 20) {
            throw new IllegalArgumentException("20 olmaz");
        }
        return "OK";
    }

}
