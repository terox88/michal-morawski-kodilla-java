package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionTestSuite {
@BeforeEach
    public void before() {
    System.out.println("Test Case: begin");
}
@AfterEach
    public void after() {
    System.out.println("Test Case: end");
}
    @DisplayName("Check if the method works correctly when an empty list was given (should return an empty list)")
    @Test
    public void testCaseEmptyList () {
        System.out.println("Testing for an empty list");

        //Given
        List<Integer> numbers = new ArrayList<>();
        OddNumbersExterminator exterminator = new OddNumbersExterminator();

        //When
        List<Integer> result = exterminator.exterminate(numbers);

        //Then
        Assertions.assertEquals(new ArrayList<Integer>(), result);

    }
    @DisplayName("Check if the method erasing all of the odd numbers from list works correctly")
    @Test
    public void testCaseVariousNumbers() {
    System.out.println("Testing for various numbers");

    //Given
    OddNumbersExterminator exterminator = new OddNumbersExterminator();
    List<Integer> numbers = new ArrayList<Integer>(Arrays.asList(3, 5, 8, 9, 1, 14, 15));




    //When
    List<Integer> result = exterminator.exterminate(numbers);
    List<Integer> expectedResult = Arrays.asList(8, 14);

    //Then
    Assertions.assertEquals(expectedResult, result);

    }
}
