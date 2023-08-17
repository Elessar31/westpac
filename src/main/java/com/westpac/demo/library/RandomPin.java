package com.westpac.demo.library;

import lombok.experimental.UtilityClass;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * The `randomPin` class provides methods for generating random PIN codes.
 */
@UtilityClass
public class RandomPin {
    static Random random = new Random();

    /**
     * Generates a random pin which has 4 digit
     *
     * @return 4 digit length pin
     */
    public static String generatePin() {

        return String.format("%04d", random.nextInt(10000));
    }

    /**
     * Generates a specified number of random unique PIN codes, each consisting of 4 digits.
     *
     * @param count The number of random PIN codes to generate. Must be between 1 and 10000.
     * @return A list of generated PIN codes.
     * @throws IllegalArgumentException If the given count is not within the valid range.
     */
    public static Set<String> generatePins(int count) {
        if (count < 1 || count >= 10000) {
            throw new IllegalArgumentException("Count must be between 1 and 10000");
        }

        Set<String> result = new HashSet<>();
        while (result.size() < count) {
            result.add(generatePin());
        }
        return result;
    }
}
