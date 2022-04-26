package com.teb.training.java.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamRun2 {

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

        List<String> asListLoc = Arrays.asList("osman",
                                               "osman",
                                               "osman",
                                               "ali",
                                               "veli",
                                               "fatma",
                                               "mehmet",
                                               "kemal",
                                               "orhan");
        Stream<String> ofLoc = Stream.of("osman",
                                         "osman",
                                         "osman",
                                         "ali",
                                         "veli",
                                         "fatma",
                                         "mehmet",
                                         "kemal",
                                         "orhan");

        Stream<Person> of2Loc = Stream.of(new Person("osman",
                                                     "yay",
                                                     200,
                                                     95),
                                          new Person("ali",
                                                     "talas",
                                                     180,
                                                     100));

        List<Person> persons = Arrays.asList(new Person("osman",
                                                        "yay",
                                                        200,
                                                        95),
                                             new Person("ali",
                                                        "talas",
                                                        180,
                                                        100),
                                             new Person("osman",
                                                        "yay",
                                                        200,
                                                        95),
                                             new Person("veli",
                                                        "tut",
                                                        185,
                                                        115));
        persons.stream()
               .filter(p -> p.getHeight() > 150)
               .forEach(System.out::println);
        persons.stream()
               .filter(p -> p.getWeight() > 90)
               .forEach(System.out::println);
        System.out.println("-------------------");
        persons.stream()
               .distinct()
               .filter(p -> p.getWeight() > 90)
               .sorted()
               .forEach(System.out::println);
        System.out.println("-------------------");
        persons.stream()
               .distinct()
               .filter(p -> p.getWeight() > 90)
               .sorted((p1,
                        p2) -> p2.getWeight() - p1.getWeight())
               .forEach(System.out::println);
        System.out.println("-------AnyMatch------------");
        boolean anyMatchLoc = persons.stream()
                                     .distinct()
                                     .filter(p -> p.getWeight() > 90)
                                     .sorted((p1,
                                              p2) -> p2.getWeight() - p1.getWeight())
                                     .anyMatch(p -> p.getHeight() > 210);
        System.out.println("anyMatch : " + anyMatchLoc);

        System.out.println("-------AllMatch------------");
        boolean allMatchLoc = persons.stream()
                                     .distinct()
                                     .filter(p -> p.getWeight() > 90)
                                     .sorted((p1,
                                              p2) -> p2.getWeight() - p1.getWeight())
                                     .allMatch(p -> p.getHeight() > 150);
        System.out.println("AllMatch : " + allMatchLoc);
        System.out.println("-------Collect toList------------");
        List<Person> collectLoc = persons.stream()
                                         .distinct()
                                         .filter(p -> p.getWeight() > 99)
                                         .sorted((p1,
                                                  p2) -> p2.getWeight() - p1.getWeight())
                                         .collect(Collectors.toList());
        System.out.println("toList : " + collectLoc);

    }
}
