package com.epam.demo;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UtilsTest {
    @Test
    void isAllPositiveNumbersTest() {
        List<String> numbers = List.of("1", "2", "10", "23", "12");
        boolean expected = true;

        boolean result = Utils.isAllPositiveNumbers(numbers);

        assertEquals(expected, result);
    }
    @Test
    void isOneNegativeOfAllPositiveNumbersTest() {
        List<String> numbers = List.of("1", "-2", "10", "23", "12");
        boolean expected = false;

        boolean result = Utils.isAllPositiveNumbers(numbers);

        assertEquals(expected, result);
    }
    @Test
    void isOneZeroOfAllPositiveNumbersTest() {
        List<String> numbers = List.of("1", "0", "10", "23", "12");
        boolean expected = false;

        boolean result = Utils.isAllPositiveNumbers(numbers);

        assertEquals(expected, result);
    }
}
