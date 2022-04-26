package com.teb.training.java.oo.interfaces;


public interface IGreet {

    static final int RUNNING_STATUS = 1;

    static String    name           = "osman";

    String greetings(String name,
                     String surname);

    default String preGreeting(final String name,
                               final String middleName,
                               final String surname) {
        return this.greetings(name + " " + middleName,
                              surname);
    }

    public static boolean test(final String name,
                               final String surname) {
        return (name.length() > surname.length()) || (name.length() > 10);
    }

}
