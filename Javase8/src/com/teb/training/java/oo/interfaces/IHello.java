package com.teb.training.java.oo.interfaces;


@FunctionalInterface
public interface IHello {

    String sayHello(String name);

    default String preHello(final String name,
                            final String middleName,
                            final String surname) {
        return this.sayHello(name + " " + middleName + " " + surname);
    }

}
