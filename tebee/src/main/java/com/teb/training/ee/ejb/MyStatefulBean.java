package com.teb.training.ee.ejb;

import javax.ejb.LocalBean;
import javax.ejb.Stateful;


@Stateful
@LocalBean
public class MyStatefulBean {

    private long counter = 0;

    public MyStatefulBean() {
    }

    public long doIt() {
        this.counter++;
        return this.counter;
    }

}
