package com.teb.training.ee.rest.person.ejb;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Singleton;

import com.teb.training.ee.rest.Person;

@LocalBean
@Singleton
public class PersonQueryService {

    @EJB
    private PersonDao personDao;

    public List<Person> findByName(final String name) {
        return this.personDao.getByName(name);
    }

    public Person findPerson(final Long personId) {
        return this.personDao.getOne(personId);
    }

    public List<Person> findAll() {
        return this.personDao.getAll();
    }


}
