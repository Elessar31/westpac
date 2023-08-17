package com.westpac.demo.library;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Set;


class RandomPinTest {

    @Test
    void generatePin() {
        String pin = RandomPin.generatePin();
        Assertions.assertEquals(4, pin.length());
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 100, 300})
    void generatePins(int number) {
        Set<String> pins = RandomPin.generatePins(number);
        Assertions.assertEquals(number, pins.size());
    }

    @ParameterizedTest
    @ValueSource(ints = {Integer.MIN_VALUE,-1, 0, 10000, Integer.MAX_VALUE})
    void generatePinsWithLessThenOne(int number) {
        IllegalArgumentException exception = Assertions.assertThrows(IllegalArgumentException.class, () -> RandomPin.generatePins(number));
        Assertions.assertEquals("Count must be between 1 and 10000", exception.getMessage());
    }
}