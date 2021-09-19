package com.romkudev.api.customer.methodReference;

import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class MethodReferenceTest {
    class MethodReferenceClass {
        Supplier<Date> newDate = Date::new;
        Consumer<String> print = System.out::print;
        Function<Object, String> objectToString = String::valueOf;
        // Integer.parseInt("10") -> 10
        Function<String, Integer> stringToInteger = Integer::parseInt;
        BiFunction<Integer, Integer, Integer> integerMax = Math::max;
    }

    @Test
    void listSortTest() {
        List<String> list = Arrays.asList("Apple", "Orange", "Kiwi");
        list.sort(Comparator.comparingInt(String::length));
        list.forEach(System.out::println);
    }
}
