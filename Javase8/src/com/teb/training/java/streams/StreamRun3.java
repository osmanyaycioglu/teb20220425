package com.teb.training.java.streams;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.teb.training.java.streams.lab1.Customer;

public class StreamRun3 {

    public static void main(final String[] args) {
        SumInt total = new SumInt();
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
               .distinct()
               .forEach(c -> total.add(c.getHeight()));
        System.out.println("Total : " + total.getTotal());
        // ---------------------------
        Stream<Person> distinctLoc = persons.stream()
                                            .distinct();

        int sumLoc = persons.stream()
                            .distinct()
                            .mapToInt(c -> c.getHeight())
                            .sum();
        System.out.println("Total sum : " + sumLoc);
        IntSummaryStatistics summary = persons.stream()
                                              .distinct()
                                              .mapToInt(c -> c.getHeight())
                                              .summaryStatistics();
        System.out.println(summary);
        // -----------------------------------------
        Integer reduceLoc = persons.stream()
                                   .distinct()
                                   .reduce(0,
                                           (i,
                                            c) -> i += c.getHeight(),
                                           (i1,
                                            i2) -> i1 + i2);
        System.out.println("Reduce : " + reduceLoc);
        ArrayList<Person> reduce2Loc = persons.stream()
                                              .distinct()
                                              .reduce(new ArrayList<Person>(),
                                                      (al,
                                                       p) -> {
                                                          al.add(p);
                                                          return al;
                                                      },
                                                      (al1,
                                                       al2) -> {
                                                          al1.addAll(al2);
                                                          return al1;
                                                      });
        System.out.println("Reduce to ArrayList : " + reduce2Loc);
        // ---------------------------------------
        List<String> collectLoc = persons.stream()
                                         .distinct()
                                         .filter(p -> p.getWeight() > 90)
                                         .map(p -> p.getName() + " " + p.getSurname()) // Bundan sonra stream String datasına döner
                                         .filter(s -> s.length() > 8)
                                         .collect(Collectors.toList());
        List<Customer> collect2Loc = persons.stream()
                                            .distinct()
                                            .filter(p -> p.getWeight() > 90)
                                            .map(p -> new Customer(p.getName()
                                                                   + p.getSurname()
                                                                      .substring(0,
                                                                                 2),
                                                                   p.getName(),
                                                                   p.getSurname(),
                                                                   new BigDecimal(p.getHeight() + p.getWeight()))) // Bundan sonra stream Customer datasına döner
                                            .collect(Collectors.toList());

    }
}

