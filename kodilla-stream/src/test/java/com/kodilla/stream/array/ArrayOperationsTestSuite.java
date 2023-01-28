package com.kodilla.stream.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArrayOperationsTestSuite {
    @Test
    void testGetAverage() {

        //Given
        int[] numbers = {3, 12, 5, 9, 15, 18, 26};

        //When
        double result = ArrayOperations.getAverage(numbers);

        //Then
        Assertions.assertEquals(12.57142857, result, 0.0000001);
    }
}
