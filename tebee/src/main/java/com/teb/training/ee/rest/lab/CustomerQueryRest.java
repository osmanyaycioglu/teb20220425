package com.teb.training.ee.rest.lab;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/api/v1/customer/query")
public class CustomerQueryRest {


    @Path("/find/one")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Customer findOne(@QueryParam("cid") final Long customerId) {
        return new Customer(10L,
                            "osmany",
                            "osman",
                            "yaycıoğlu",
                            new BigDecimal(10_000));
    }

    @Path("/find/all")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Customer> findAll() {
        return Arrays.asList(new Customer(10L,
                                          "osmany",
                                          "osman",
                                          "yaycıoğlu",
                                          new BigDecimal(10_000)),
                             new Customer(11L,
                                          "aliu",
                                          "ali",
                                          "ulaş",
                                          new BigDecimal(15_000)));
    }

    @Path("/find/by/username")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Customer findByUsername(@QueryParam("username") final String username) {
        return new Customer(10L,
                            "osmany",
                            "osman",
                            "yaycıoğlu",
                            new BigDecimal(10_000));
    }

    @Path("/find/by/surname")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Customer> findBySurname(@QueryParam("surname") final String surname) {
        return Arrays.asList(new Customer(10L,
                                          "osmany",
                                          "osman",
                                          surname,
                                          new BigDecimal(10_000)),
                             new Customer(11L,
                                          "aliu",
                                          "ali",
                                          surname,
                                          new BigDecimal(15_000)));
    }


}
