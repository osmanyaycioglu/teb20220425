package com.teb.training.ee.ejb;

public class MyStatefulBeanProxy extends MyStatefulBean {

    @Override
    public long doIt() {
        // transaction aç
        long doItLoc = super.doIt();
        // transaction kapat
        return doItLoc;
    }
}
