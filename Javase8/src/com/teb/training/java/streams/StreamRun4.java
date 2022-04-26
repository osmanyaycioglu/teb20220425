package com.teb.training.java.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamRun4 {

    public static void main(final String[] args) {
        List<String> asListLoc = Arrays.asList("  osman,yaycıoğlu,200,95  ",
                                               "ali , talas,180,  100",
                                               " ali,talas ,180",
                                               "ali,talas,180,100   ",
                                               "veli,ol,190,120");
        List<Person> collectLoc = asListLoc.stream()
                                           .map(s -> s.split(","))
                                           .filter(sa -> sa.length == 4)
                                           .map(sa -> new Person(sa[0].trim(),
                                                                 sa[1].trim(),
                                                                 Integer.parseInt(sa[2].trim()),
                                                                 Integer.parseInt(sa[3].trim())))
                                           .distinct()
                                           .collect(Collectors.toList());
        collectLoc.forEach(System.out::println);
    }
}

