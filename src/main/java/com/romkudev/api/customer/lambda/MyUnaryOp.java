package com.romkudev.api.customer.lambda;

@FunctionalInterface
public interface MyUnaryOp {
    int operator(Integer a);
}
