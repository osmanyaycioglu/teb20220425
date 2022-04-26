package com.teb.training.java.oo.interfaces;


public class GreetingRun {

    public static void main(final String[] args) {
        IGreet greetLoc = (n,
                           s) -> "Hello " + n + " " + s;
        String preGreetingLoc = greetLoc.preGreeting("osman",
                                                     "tulgar",
                                                     "yaycıoğlu");
        System.out.println(preGreetingLoc);
    }
}
