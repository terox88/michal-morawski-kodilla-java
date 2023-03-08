package com.kodilla.good.patterns.challenges;

import java.util.stream.LongStream;

public class Factorial {

    public long calculateFactorial(int n) {
        return LongStream.rangeClosed(1, n).reduce(1, (result, current) -> result = result * current);
    }
}
