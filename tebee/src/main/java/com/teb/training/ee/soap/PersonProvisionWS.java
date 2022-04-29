package com.teb.training.ee.soap;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.ResponseWrapper;

import com.teb.training.ee.rest.Person;

@WebService(targetNamespace = "http://person.provison.teb.com")
public class PersonProvisionWS {

    @ResponseWrapper(partName = "sonuc")
    public String activatePerson(@WebParam(name = "person") final Person personParam) {
        return "OK";
    }

    @WebMethod(operationName = "deactivate")
    // @ResponseWrapper(partName = "sonuc", localName = "son")
    @WebResult(name = "son", partName = "sonuc")
    public String deactivatePerson(@WebParam(name = "personId") final Long personId) {
        if (personId == 20) {
            throw new IllegalArgumentException("20 olmaz");
        }
        return "OK";
    }

}
