package com.example.unittest;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class LambdaTest {

    @Test
    void lambdaExpressions() {
        List<Integer> numbers = Arrays.asList(1, 1, 4);
        assertTrue(numbers.stream()
        .mapToInt(Integer::intValue)
        .sum() > 5, () -> "Sum should be greater than 5");
    }

    @Test
    void groupAssertions() {
     int[] numbers = {0, 1, 2, 3, 4};
     assertAll("numbers",
         () -> assertEquals(numbers[0], 0),
         () -> assertEquals(numbers[3], 3),
         () -> assertEquals(numbers[4],4)
     );
 }
    
}
