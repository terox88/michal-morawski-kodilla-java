package com.kodilla.testing;

import com.kodilla.testing.calculator.SimpleCalculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args) {
        VowelExtract extract = new VowelExtract();
        String result = extract.extract("Yellow submarine");
        System.out.println(result);



    }
}
