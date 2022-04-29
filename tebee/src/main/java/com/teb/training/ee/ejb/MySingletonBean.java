package com.teb.training.ee.ejb;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import javax.ejb.LocalBean;
import javax.ejb.Lock;
import javax.ejb.LockType;
import javax.ejb.Singleton;

import com.teb.training.ee.rest.Person;


@Singleton
@LocalBean
public class MySingletonBean {

    private final List<Person> persons  = Collections.synchronizedList(new ArrayList<>());
    private long               counter  = 0;
    private final AtomicLong   acounter = new AtomicLong();

    public MySingletonBean() {
    }

    public synchronized void increase() {
        this.counter++;
    }

    public long doIt() {
        this.counter++;
        return this.counter;
    }

    @Lock(LockType.WRITE)
    public String activate(final Person personParam) {
        this.acounter.incrementAndGet();
        this.counter++; //  yanlış
        this.increase();
        this.persons.add(personParam);
        return "OK";
    }

    @Lock(LockType.READ)
    public String xyz(final Person personParam) {
        this.acounter.incrementAndGet();
        this.counter++; //  yanlış
        this.increase();
        this.persons.add(personParam);
        return "OK";
    }

}
