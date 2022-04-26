package com.teb.training.java.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamRun {

    public static void main(final String[] args) {
        List<String> stringsLoc = new ArrayList<>();
        stringsLoc.add("osman");
        stringsLoc.add("osman");
        stringsLoc.add("osman");
        stringsLoc.add("ali");
        stringsLoc.add("veli");
        stringsLoc.add("veli");
        stringsLoc.add("ayşe");
        stringsLoc.add("fatma");
        stringsLoc.add("fatma");
        stringsLoc.add("fatma");
        //        Set<String> setLoc = new TreeSet<>();
        //        for (String stringLoc : stringsLoc) {
        //            setLoc.add(stringLoc);
        //        }
        //        List<String> sonucListLoc = new ArrayList<>();
        //        for (String stringLoc : setLoc) {
        //            if (stringLoc.length() >= 5) {
        //                sonucListLoc.add(stringLoc);
        //            }
        //        }
        //        for (String stringLoc : sonucListLoc) {
        //            System.out.println(stringLoc);
        //        }

        Stream<String> streamLoc = stringsLoc.stream();

        stringsLoc.stream()
                  .distinct()
                  .filter(s -> s.length() >= 5)
                  .sorted()
                  .forEach(System.out::println);

        stringsLoc.stream()
                  .filter(s -> s.length() > 2)
                  .filter(s -> s.contains("a"))
                  .forEach(System.out::println);

    }
}
