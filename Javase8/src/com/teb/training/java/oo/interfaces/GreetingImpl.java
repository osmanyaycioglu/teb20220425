package com.teb.training.java.oo.interfaces;


public class GreetingImpl implements IGreet {

    @Override
    public String preGreeting(final String nameParam,
                              final String middleNameParam,
                              final String surnameParam) {
        return IGreet.super.preGreeting(nameParam,
                                        middleNameParam,
                                        surnameParam);
    }

    @Override
    public String greetings(final String nameParam,
                            final String surnameParam) {
        return "hello " + nameParam + " " + surnameParam;
    }
}
