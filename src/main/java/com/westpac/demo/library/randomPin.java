package com.westpac.demo.library;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * The `randomPin` class provides methods for generating random PIN codes.
 */
public class randomPin {
    /**
     * Generates a random pin which has 4 digit
     * @return 4 digit length pin
     */
    public static String generatePin() {
        Random random = new Random();
        return String.format("%04d", random.nextInt(10000));
    }

    /**
     * Generates a specified number of random PIN codes, each consisting of 4 digits.
     *
     * @param count The number of random PIN codes to generate. Must be between 1 and 10000.
     * @return A list of generated PIN codes.
     * @throws IllegalArgumentException If the given count is not within the valid range.
     */
    public static List<String> generatePins(int count) {
        if (count < 1 || count > 10000) {
            throw new IllegalArgumentException("Count must be between 1 and 10000");
        }

        List<String> result = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            result.add(generatePin());
        }
        return result;
    }
}
