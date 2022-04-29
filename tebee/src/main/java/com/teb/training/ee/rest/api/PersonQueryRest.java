package com.teb.training.ee.rest.api;

import java.util.List;

import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.teb.training.ee.rest.Person;
import com.teb.training.ee.rest.person.ejb.PersonQueryService;

@Path("/api/v1/person/query")
@Produces(MediaType.APPLICATION_JSON)
public class PersonQueryRest {

    @EJB
    private PersonQueryService queryService;

    @Path("/find/by/name")
    @GET
    public List<Person> findByName(@QueryParam("name") final String name) {
        return this.queryService.findByName(name);
    }

    @Path("/find/one/{pid}")
    @GET
    public Person findPerson(@PathParam("pid") final Long personId) {
        return this.queryService.findPerson(personId);
    }

    @Path("/find/all")
    @GET
    public List<Person> findAll() {
        return this.queryService.findAll();
    }

}
