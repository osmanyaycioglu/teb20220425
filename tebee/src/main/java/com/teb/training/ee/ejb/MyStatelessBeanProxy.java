package com.teb.training.ee.ejb;

public class MyStatelessBeanProxy extends MyStatelessBean {
    // pool


    @Override
    public long doIt() {
        // pool a git instance al
        MyStatelessBean beanLoc = null;
        long doItLoc = beanLoc.doIt();
        // pool a geri koy
        return doItLoc;
    }
}
