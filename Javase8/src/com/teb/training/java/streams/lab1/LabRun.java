package com.teb.training.java.streams.lab1;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LabRun {

    public static void main(final String[] args) {
        List<Customer> customerListLoc = Arrays.asList(new Customer("osmany",
                                                                    "osman",
                                                                    "yaycıoğlu",
                                                                    new BigDecimal(4000)),
                                                       new Customer("osmany",
                                                                    "osman",
                                                                    "yaycıoğlu",
                                                                    new BigDecimal(4000)),
                                                       new Customer("osmany",
                                                                    "osman",
                                                                    "yaycıoğlu",
                                                                    new BigDecimal(4000)),
                                                       new Customer("alit",
                                                                    "alis",
                                                                    "talas",
                                                                    new BigDecimal(4500)),
                                                       new Customer("bekirb",
                                                                    "bekir",
                                                                    "buyuk",
                                                                    new BigDecimal(1000)));
        List<Customer> collectLoc = customerListLoc.stream()
                                                   .distinct()
                                                   .sorted((c1,
                                                            c2) -> c1.getUsername()
                                                                     .compareTo(c2.getUsername()))
                                                   .filter(c -> c.getAmount()
                                                                 .intValue() > 3000)
                                                   .collect(Collectors.toList());

        collectLoc.forEach(c -> System.out.println(c));
    }
}
