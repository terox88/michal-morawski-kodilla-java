package com.kodilla.exception.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FirstChallengeTestSuite {

    @Test
    public void TestCaseZeroToPower(){
        //Given
        FirstChallenge firstChallenge = new FirstChallenge();

        //When
        int result = firstChallenge.power(0, 3);

        //Then
        Assertions.assertEquals(0, result);
    }

    @Test
    public void TestCaseZeroExponent(){
        //Given
        FirstChallenge firstChallenge = new FirstChallenge();

        //When
        int result = firstChallenge.power(4, 0);

        //Then
        Assertions.assertEquals(1, result);
    }
    @Test
    public void TestCaseNumberToOne(){
        //Given
        FirstChallenge firstChallenge = new FirstChallenge();

        //When
        int result = firstChallenge.power(4, 1);

        //Then
        Assertions.assertEquals(4, result);
    }
    @Test
    public void TestCaseSimplePower(){
        //Given
        FirstChallenge firstChallenge = new FirstChallenge();

        //When
        int result = firstChallenge.power(4, 4);

        //Then
        Assertions.assertEquals(256, result);
    }

}
