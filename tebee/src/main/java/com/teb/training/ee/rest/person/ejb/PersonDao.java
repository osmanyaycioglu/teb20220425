package com.teb.training.ee.rest.person.ejb;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import com.teb.training.ee.rest.Person;

@Stateless
@LocalBean
@TransactionManagement(TransactionManagementType.BEAN)
public class PersonDao {

    @PersistenceContext(unitName = "tebee")
    private EntityManager entityManager;

    @Transactional(rollbackOn = {
                                  IllegalArgumentException.class,
                                  IllegalStateException.class
    })
    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public void insert(final Person personParam) {
        this.entityManager.persist(personParam);
    }

    @Transactional
    @TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
    public void update(final Person personParam) {
        boolean containsLoc = this.entityManager.contains(personParam);
        if (!containsLoc) {
            this.entityManager.merge(personParam);
        }
    }

    @Transactional
    public void remove(final Person personParam) {
        boolean containsLoc = this.entityManager.contains(personParam);
        if (!containsLoc) {
            Person mergeLoc = this.entityManager.merge(personParam);
            this.entityManager.remove(mergeLoc);
        } else {
            this.entityManager.remove(personParam);
        }

    }

    public List<Person> getByName(final String nameParam) {
        TypedQuery<Person> createQueryLoc = this.entityManager.createQuery("select p from Person p where p.name=?1",
                                                                           Person.class);
        createQueryLoc.setParameter(1,
                                    nameParam);
        return createQueryLoc.getResultList();
    }

    public List<Person> getByName2(final String nameParam) {
        TypedQuery<Person> createQueryLoc = this.entityManager.createQuery("select p from Person p where p.name=:xyz",
                                                                           Person.class);
        createQueryLoc.setParameter("xyz",
                                    nameParam);
        return createQueryLoc.getResultList();
    }

    @SuppressWarnings("unchecked")
    public List<Person> getByNameNative(final String nameParam) {
        Query createNativeQueryLoc = this.entityManager.createNativeQuery("select * from kisi where p.name=?1",
                                                                          Person.class);
        createNativeQueryLoc.setParameter(1,
                                          nameParam);
        return createNativeQueryLoc.getResultList();
    }

    public Person getOne(final Long personId) {
        return this.entityManager.find(Person.class,
                                       personId);
    }

    public List<Person> getAll() {
        TypedQuery<Person> createQueryLoc = this.entityManager.createQuery("select p from Person p",
                                                                           Person.class);
        return createQueryLoc.getResultList();

    }

    public void insertPureJava(final Person personParam) {
        this.entityManager.joinTransaction();

        this.entityManager.getTransaction()
                          .begin();
        try {
            this.entityManager.persist(personParam);
            this.entityManager.getTransaction()
                              .commit();
        } catch (IllegalArgumentException | IllegalStateException eLoc) {
            this.entityManager.getTransaction()
                              .rollback();
        } catch (Exception eLoc) {
            this.entityManager.getTransaction()
                              .commit();
        }
    }

}
