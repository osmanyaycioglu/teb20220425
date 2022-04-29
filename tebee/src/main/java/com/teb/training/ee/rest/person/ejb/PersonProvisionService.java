package com.teb.training.ee.rest.person.ejb;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Singleton;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.transaction.Transactional;

import com.teb.training.ee.rest.Person;

@LocalBean
@Singleton
@TransactionManagement(TransactionManagementType.BEAN)
public class PersonProvisionService {

    @EJB
    private PersonDao personDao;

    @Transactional
    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public void activate(final Person person) {
        this.personDao.insert(person);
        this.personDao.insert(person);
        this.personDao.update(person);
    }

    @NonTransactional
    public void deactivate(final Long personIdParam) {
        Person oneLoc = this.personDao.getOne(personIdParam);
        if (oneLoc != null) {
            this.personDao.remove(oneLoc);
        }
    }

}
