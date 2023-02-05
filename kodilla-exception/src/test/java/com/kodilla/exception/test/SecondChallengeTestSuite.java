package com.kodilla.exception.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SecondChallengeTestSuite {
    SecondChallenge secondChallenge;

    @BeforeEach
    public void makingObject (){
        secondChallenge = new SecondChallenge();
    }

    @Test
    @DisplayName("When x >= 2 and y is different than 1.5 method should throw exception")
    public void whenXEqualsOrGraterThanTwo() {

        //When and then
        Assertions.assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(2.0, 2.0));
        Assertions.assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(3.0, 2.0));
    }


    @Test
    @DisplayName("When x < 1 and y is different than 1.5 method should throw exception")
    public void whenXIsSmallerThanOne() {

        //When and then
        Assertions.assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(0.4, 2.0));
        Assertions.assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(0.9, 2.0));
    }
    @Test
    @DisplayName("When x is between 1.9 and 1.1 and y equals 1.5 method should throw exception")
    public void whenYEqualsOneAndHalf() {

        //When and then
        Assertions.assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(1.9, 1.5));
        Assertions.assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(1.1, 1.5));
    }

    @Test
    @DisplayName("When x is between 1.9 and 1.1 and y is different than 1.5 method shouldn't throw exception")
    public void whenXAndYAreGoodToGo() {

        //When and then
        Assertions.assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1.9, 1.6));
        Assertions.assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1.1, 2.0));
    }
}
