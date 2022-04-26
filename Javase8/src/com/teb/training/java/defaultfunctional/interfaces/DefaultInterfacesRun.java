package com.teb.training.java.defaultfunctional.interfaces;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class DefaultInterfacesRun {

    public static void main(final String[] args) {
        Predicate<String> pre1 = f -> f.length() > 5;
        Predicate<Integer> pre2 = i -> i > 5;
        Predicate<Long> pre3 = l -> l == 53489075834757345L;

        BiPredicate<String, String> bipre1 = (s1,
                                              s2) -> s1.equals(s2);

        Predicate<Integer> pre4 = i -> i > 5;
        // Function
        Function<String, Integer> func1 = s -> s.length();
        Function<String, Long> func2 = s -> Long.parseLong(s);
        Function<Double, Long> func3 = d -> d.longValue() + 10L;
        Function<String, String> func4 = s -> s + " sayın";

        UnaryOperator<String> unop1 = s -> s + " sayın";

        // BiFunction
        BiFunction<String, String, String> bifunc1 = (s1,
                                                      s2) -> s1 + " " + s2;
        BinaryOperator<String> binop1 = (s1,
                                         s2) -> s1 + " " + s2;

        Consumer<String> cons1 = s -> System.out.println(s);

        BiConsumer<String, String> bicons1 = (s1,
                                              s2) -> System.out.println(s1 + " " + s2);

        Supplier<String> sup1 = () -> "osman";
    }
}
