# Random PIN Generator

The `randomPin` class provides a simple Java utility for generating random PIN codes. Each generated PIN code consists of 4 digits.

## Table of Contents

- [Introduction](#introduction)
- [Methods](#methods)
- [Usage](#usage)

## Introduction

The `randomPin` class offers two methods for generating random PIN codes:

1. `generatePin()`: Generates a single random PIN code with 4 digits.
2. `generatePins(int count)`: Generates a specified number of random PIN codes, each consisting of 4 digits. The count should be between 1 and 10000.

## Methods

### \`generatePin()\`

Generates a random PIN code consisting of 4 digits.

```java
public static String generatePin()
```

**Returns**:

 - A 4-digit random PIN code.

### \`generatePins(int count)\`

Generates a specified number of random unique PIN codes, each consisting of 4 digits.


```java
public static Set<String> generatePins(int count)
```
**Parameters**:

 - **\`count\`** (int): The number of random PIN codes to generate. Must be between 1 and 10000.


**Returns:**

 - A list of generated PIN codes.

**Throws:**

 - IllegalArgumentException if the given count is not within the valid range.

## Usage

Here's an example of how to use the randomPin class in your Java program:

```java

import java.util.List;

public class ExampleUsage {
public static void main(String[] args) {
String singlePin = randomPin.generatePin();
System.out.println("Single random PIN: " + singlePin);

        int numberOfPins = 5;
        Set<String> pinsList = randomPin.generatePins(numberOfPins);
        System.out.println("Generated PINs: " + pinsList);
    }
}
```