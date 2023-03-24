package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LoggerTestSuite {
    private Logger logger;

    @Test
    void testLogger() {
        //Given
        logger = Logger.INSTANCE;
        logger.log("Test log");

        //When
        String result = logger.getLastLog();

        //Then
        Assertions.assertEquals("Test log", result);
    }
}
