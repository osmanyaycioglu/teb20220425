package com.teb.training.java.oo.interfaces;


public class HelloEng implements IHello {

    @Override
    public String sayHello(final String nameParam) {
        return "Hello " + nameParam;
    }

    public void xyz() {
        System.out.println("test");
    }

}
