package com.teb.training.ee.rest.api;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;

import com.teb.training.ee.rest.Person;

@Path("/api/v1/person/query")
public class PersonQueryRest {

    @Path("/find/by/name")
    @GET
    public List<Person> findByName(@QueryParam("name") final String name) {
        return null;
    }

    @Path("/find/one/{pid}")
    @GET
    public Person findPerson(@PathParam("pid") final Long personId) {
        return null;
    }

    @Path("/find/all")
    @GET
    public List<Person> findAll() {
        return null;
    }

}
