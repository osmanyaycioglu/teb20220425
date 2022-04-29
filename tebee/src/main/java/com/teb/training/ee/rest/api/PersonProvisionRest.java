package com.teb.training.ee.rest.api;

import javax.ejb.EJB;
import javax.enterprise.context.ApplicationScoped;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import com.teb.training.ee.rest.Person;
import com.teb.training.ee.rest.person.ejb.PersonProvisionService;

@ApplicationScoped
@Path("/api/v1/person/provision")
@Valid
public class PersonProvisionRest {

    @EJB
    private PersonProvisionService provisionService;

    @Path("/activate")
    @POST
    public String activatePerson(@Valid final Person personParam) {
        this.provisionService.activate(personParam);
        return "OK";
    }

    @Path("/deactivate/{pid}")
    @GET
    public String deactivatePerson(@NotNull @Positive @PathParam("pid") final Long personId) {
        this.provisionService.deactivate(personId);
        return "OK";
    }

}
