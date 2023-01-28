package com.kodilla.stream.array;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public interface ArrayOperations {

    public static Double getAverage(int[] number) {

        IntStream.range(0, number.length)
                .map(n -> number[n])
                .forEach(System.out::println);

        OptionalDouble result = IntStream.range(0, number.length)
                .map(n -> number[n])
                .average();
        return result.getAsDouble();
    }
}
