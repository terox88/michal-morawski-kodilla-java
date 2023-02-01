package com.kodilla.exception.test;

public class FirstChallenge {
    public double divide(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException();
        }
        return a / b;
    }

    public int power(int base, int exponent) throws ArithmeticException {
        int result = base;

            if (base == 0) return 0;
            if (exponent == 0) return 1;
            if (exponent == 1) return base;

            for (int i = 0; i < exponent - 1; i++) {
                result = result * base;

            }

        return result;
    }



    public static void main(String[] args) {
        FirstChallenge firstChallenge = new FirstChallenge();
        try {
            double result = firstChallenge.divide(3, 0);
            System.out.println(result);
        }catch (ArithmeticException e) {
            System.out.println("Pamiętaj cholero nie dziel przez zero!");
        }


    }
}


