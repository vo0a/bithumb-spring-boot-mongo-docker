package com.romkudev.api.customer.stream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class StreamTest {

    @DisplayName("Stream isEmpty() Count")
    @Test
    void streamIsEmptyTest() {
        Stream<String> stream = Arrays.asList("Apple", "Orange", "").stream();
        int emptyStrings = (int) stream.filter(String::isEmpty).count();
        assertThat(emptyStrings, is(equalTo(1)));
    }
}
