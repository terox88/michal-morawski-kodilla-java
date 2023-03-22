package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CalculatorTestSuite {
    @Autowired
    Calculator calculator;

    @Test
    void testCalculations() {
        //Given
        //When
        double addResult = calculator.add(2.0, 2.0);
        double subResult = calculator.sub(4.5, 1.5);
        double mulResult = calculator.mul(2.0, 3.0);
        double divResult = calculator.div(4.0, 2.0);

        //Then
        Assertions.assertEquals(4.0, addResult, 0.0001);
        Assertions.assertEquals(3.0, subResult,0.0001);
        Assertions.assertEquals(6.0, mulResult, 0.0001);
        Assertions.assertEquals(2.0, divResult, 0.0001);
    }
}
