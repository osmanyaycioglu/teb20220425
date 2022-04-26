package com.teb.training.java.streams;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamRun5 {

    public static void main(final String[] args) {
        Map<String, Person> personMap = new HashMap<>();
        personMap.put("1",
                      new Person("osman",
                                 null,
                                 null,
                                 null));

        Person personLoc = personMap.get("1");

        List<String> asListLoc = Arrays.asList("  osman,yaycıoğlu,200,95  ",
                                               "ali , talas,180,  100",
                                               " ali,talas ,180",
                                               "ali,talas,180,100   ",
                                               "veli,ol,190,120");
        Map<String, Person> collectLoc = asListLoc.stream()
                                                  .map(s -> s.split(","))
                                                  .filter(sa -> sa.length == 4)
                                                  .map(sa -> new Person(sa[0].trim(),
                                                                        sa[1].trim(),
                                                                        Integer.parseInt(sa[2].trim()),
                                                                        Integer.parseInt(sa[3].trim())))
                                                  .distinct()
                                                  .collect(Collectors.toMap(p -> p.getName() + p.getSurname(),
                                                                            p -> p));
    }
}

