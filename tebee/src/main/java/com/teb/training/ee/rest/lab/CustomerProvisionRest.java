package com.teb.training.ee.rest.lab;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/api/v1/customer/provision")
@Produces(MediaType.TEXT_PLAIN)
public class CustomerProvisionRest {

    @Path("/activate")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public String activate(final Customer customerParam) {
        if (customerParam.getName() == null) {
            throw new IllegalArgumentException("name null olamaz");
        }
        return "OK";
    }

    @Path("/deactivate/{cid}")
    @GET
    public String deactivate(@PathParam("cid") final Long customerId) {
        return "OK";
    }


}
