package com.kodilla.exception.main;

import com.kodilla.exception.io.FileReader;
import com.kodilla.exception.io.FileReaderWithoutHandling;

import java.io.IOException;

public class ExceptionModuleRunner {
    public static void main(String[] args) {
        FileReaderWithoutHandling fileReaderWithoutHandling = new FileReaderWithoutHandling();
        try {
            fileReaderWithoutHandling.readFile();
        }catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
