package com.westpac.demo.library;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;


class RandomPinTest {

    @Test
    void generatePin() {
        String pin = randomPin.generatePin();
        Assertions.assertEquals(4,pin.length());
    }

    @Test
    void generatePins() {
        List<String> pins = randomPin.generatePins(10);
        Assertions.assertEquals(10,pins.size());
    }
}