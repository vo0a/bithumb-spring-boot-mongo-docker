package com.romkudev.api.customer.lambda;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.*;

class MathOperationTest {

    @Test
    void main() {
        MathOperation plus = (a, b) -> a + b;
        MathOperation times = (a, b) -> a * b;
        assertThat(plus.main(3, 5), is(equalTo(8)));
        assertThat(times.main(5, 6), is(equalTo(30)));
    }
}