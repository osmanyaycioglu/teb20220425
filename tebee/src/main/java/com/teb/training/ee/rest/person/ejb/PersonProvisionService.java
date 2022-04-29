package com.teb.training.ee.rest.person.ejb;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Singleton;

import com.teb.training.ee.rest.Person;

@LocalBean
@Singleton
public class PersonProvisionService {

    @EJB
    private PersonDao personDao;

    public void activate(final Person person) {
        this.personDao.insert(person);
    }

    public void deactivate(final Long personIdParam) {
        Person oneLoc = this.personDao.getOne(personIdParam);
        if (oneLoc != null) {
            this.personDao.remove(oneLoc);
        }
    }

}
