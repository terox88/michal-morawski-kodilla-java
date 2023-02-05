package com.kodilla.exception.test;

public class ExceptionHandling {

    public static void main(String[] args) {

        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            System.out.println(secondChallenge.probablyIWillThrowException(2.4, 1.5));
        }catch (Exception e) {
            System.out.println("Error: " + e );
        }finally {
            System.out.println("It was a test for an exception");
        }
        System.out.println("End of the test");
        System.out.println("\nTest for Flight Search");

        FlightSearch flightSearch = new FlightSearch();

        try {
            System.out.println(flightSearch.findFlight(new Flight("Warsaw","Cracow")));
        } catch (RouteNotFoundException r) {
            System.out.println("Error: No such destination in database");
        }
        System.out.println("End of test");

    }
}
