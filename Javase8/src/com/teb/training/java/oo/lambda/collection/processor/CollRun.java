package com.teb.training.java.oo.lambda.collection.processor;

import java.util.ArrayList;
import java.util.List;

public class CollRun {

    public static void main(final String[] args) {
        MyCollectionProcessor<String> mcp = new MyCollectionProcessor<>();
        mcp.add("osman");
        mcp.add("yaycıoğlu");
        mcp.add("ali");
        mcp.add("veli");
        mcp.process(h -> System.out.println(h));
        System.out.println("--------------");
        mcp.process(h -> System.out.print(h + " "));
        System.out.println("--------------");

        mcp.processData(s -> s + " p")
           .processData(s -> s + ".");

        System.out.println("------DSL--------");

        MyCollectionProcessor<String> m1 = new MyCollectionProcessor<String>().add("osman")
                                                                              .add("ali")
                                                                              .add("veli")
                                                                              .add("ayşe")
                                                                              .processData(s -> s + " d")
                                                                              .processData(s -> s + ".")
                                                                              .processData(s -> s + "x")
                                                                              .add("kemal")
                                                                              .process(h -> System.out.print(h + " "));


        List<String> listLoc = new ArrayList<>();
        listLoc.add("osman");
        listLoc.add("yaycıoğlu");
        listLoc.add("ali");
        listLoc.add("veli");

        listLoc.forEach(System.out::println);

        //        for (String stringLoc : listLoc) {
        //            System.out.println(stringLoc);
        //        }


    }
}
