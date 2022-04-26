package com.teb.training.java.oo.interfaces;


public class HelloTr implements IHello {

    @Override
    public String sayHello(final String nameParam) {
        return "Selam " + nameParam;
    }

}
