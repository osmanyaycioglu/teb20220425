package com.teb.training.ee.rest;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.PATCH;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.teb.training.ee.ejb.MySingletonBean;
import com.teb.training.ee.ejb.MyStatefulBean;
import com.teb.training.ee.ejb.MyStatelessBean;

@RequestScoped
@Path("/first")
@Produces("text/plain")
public class FirstRestClass {

    @EJB
    private MySingletonBean mySingletonBean;

    @EJB
    private MyStatefulBean  myStatefulBean;

    @EJB
    private MyStatelessBean myStatelessBean;

    private int             localCounter = 0;


    @Path("/singleton")
    @GET
    public String singleton() {
        this.localCounter++;
        return "Counter : " + this.mySingletonBean.doIt() + " localCounter : " + this.localCounter;
    }

    @Path("/stateful")
    @GET
    public String stateful() {
        this.localCounter++;
        return "Counter : " + this.myStatefulBean.doIt() + " localCounter : " + this.localCounter;
    }

    @Path("/stateless")
    @GET
    public String stateless() {
        this.localCounter++;
        return "Counter : "
               + this.myStatelessBean.doIt()
               + " localCounter : "
               + this.localCounter
               + " doit2 : "
               + this.myStatelessBean.doIt2();
    }

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
