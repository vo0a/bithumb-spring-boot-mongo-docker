package com.romkudev.api.customer.lambda;

@FunctionalInterface
public interface MyPredicate {
    boolean test(String str);
}
