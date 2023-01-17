package com.kodilla.testing;

public class TestingMain {
    public static void main(String[] args) {
        System.out.println("Moduł 6. Wprowadzenie to testowania oprogramowania");
        VowelExtract vowel = new VowelExtract();
        String extracted = vowel.extract("Test of the Extraction");
        System.out.println(extracted);
    }
}
