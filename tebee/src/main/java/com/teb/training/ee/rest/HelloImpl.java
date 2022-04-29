package com.teb.training.ee.rest;

import java.util.Date;

import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.teb.training.ee.ejb.MySingletonBean;

@Path("/hello")
@Produces("text/plain")
public class HelloImpl {

    @EJB
    private MySingletonBean mySingletonBean;

    // /tebee/api/hello/greet/osman/yay
    @Path("/greet/{abc}/{xyz}")
    @GET
    public String greet(@PathParam("abc") final String name,
                        @PathParam("xyz") final String surname) {
        return "Greetings " + name + " " + surname;
    }

    // /tebee/api/hello/greet2/ali/sur/veli
    @Path("/greet2/{abc}/sur/{xyz}")
    @GET
    public String greet2(@PathParam("abc") final String name,
                         @PathParam("xyz") final String surname) {
        return "Greetings 2 " + name + " " + surname;
    }

    // /tebee/api/hello/greet3?abc=osman&xyz=yay
    @Path("/greet3")
    @GET
    public String greet3(@QueryParam("abc") final String name,
                         @QueryParam("xyz") final String surname) {
        return "Greetings 3 " + name + " " + surname;
    }

    // /tebee/api/hello/greet4/osman?soyisim=yay
    @Path("/greet4/{isim}")
    @GET
    public String greet4(@PathParam("isim") final String name,
                         @QueryParam("soyisim") final String surname) {
        return "Greetings 4 " + name + " " + surname;
    }

    @Path("/greet5")
    @GET
    public String greet5(@QueryParam("isim") final String name,
                         @QueryParam("soyisim") final String surname,
                         @QueryParam("yas") final Integer age,
                         @QueryParam("basla") final Long startTime,
                         @QueryParam("aci") final Double angle) {
        return "Greetings 5 " + name + " " + surname + " yaş : " + age + " start : " + startTime + " angle : " + angle;
    }

    @Path("/greet6")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public String greet6(final Person person) {
        return "Greetings 5 "
               + person.getName()
               + " "
               + person.getSurname()
               + " yaş : "
               + person.getAge()
               + " start : "
               + person.getStartTime()
               + " angle : "
               + person.getAngle();
    }

    @Path("/greet7")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public GreetingResponse greet7(final Person person) {
        GreetingResponse response = new GreetingResponse();
        response.setPersonName(person.getName() + " " + person.getSurname());
        response.setStarted(true);
        response.setDate(new Date());
        return response;
    }

}
