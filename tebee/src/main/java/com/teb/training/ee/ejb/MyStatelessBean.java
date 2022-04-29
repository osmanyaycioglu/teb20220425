package com.teb.training.ee.ejb;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

@Stateless
@LocalBean
public class MyStatelessBean {

    private long counter = 0;

    public MyStatelessBean() {
    }

    public long doIt() {
        this.counter++;
        return this.counter;
    }

    public long doIt2() {
        this.counter++;
        return this.counter;
    }

}
