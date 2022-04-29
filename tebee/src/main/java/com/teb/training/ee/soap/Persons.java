package com.teb.training.ee.soap;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.teb.training.ee.rest.Person;

@XmlRootElement
public class Persons {

    private List<Person> personList;

    public List<Person> getPersonList() {
        return this.personList;
    }

    public void setPersonList(final List<Person> personListParam) {
        this.personList = personListParam;
    }


}
