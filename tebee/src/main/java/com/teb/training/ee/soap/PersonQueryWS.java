package com.teb.training.ee.soap;

import javax.jws.WebParam;
import javax.jws.WebService;

import com.teb.training.ee.rest.Person;

@WebService(targetNamespace = "http://person.teb.com")
public class PersonQueryWS {

    public Persons findByName(@WebParam(name = "name") final String name) {
        return null;
    }

    public Person findPerson(@WebParam(name = "personId") final Long personId) {
        return null;
    }

    public Persons findAll() {
        return null;
    }

}
