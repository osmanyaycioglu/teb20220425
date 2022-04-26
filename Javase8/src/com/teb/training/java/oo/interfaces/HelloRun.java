package com.teb.training.java.oo.interfaces;


public class HelloRun {

    public static void main(final String[] args) {
        IHello helloEngLoc = new HelloEng();
        String sayHelloLoc = helloEngLoc.sayHello("osman");
        System.out.println(sayHelloLoc);

        IHello anonimHello = new IHello() {

            @Override
            public String sayHello(final String nameParam) {
                return "Anonim merhaba " + nameParam + " from created scope : " + sayHelloLoc;
            }
        };

        System.out.println(anonimHello.sayHello("ali"));
        IHello anonimHello2 = new IHello() {

            @Override
            public String sayHello(final String nameParam) {
                return "Anonim merhaba 2 " + nameParam;
            }
        };

        System.out.println(anonimHello2.sayHello("ayşe"));

        IHello helloLambda = nameParam -> "Lambda merhaba " + nameParam;
        System.out.println(helloLambda.sayHello("mehmet"));

        IHello helloLambda2 = f -> {
            System.out.println("deneme satırı");
            return "Lambda merhaba " + f;
        };
        System.out.println(helloLambda2.sayHello("mehmet"));

    }
}
