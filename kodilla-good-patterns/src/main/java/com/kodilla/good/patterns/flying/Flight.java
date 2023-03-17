package com.kodilla.good.patterns.flying;

import java.util.Objects;

public class Flight {
    private String departure;
    private  String arrival;

    public Flight(String departure, String arrival) {
        this.departure = departure;
        this.arrival = arrival;
    }

    public String getDeparture() {
        return departure;
    }

    public String getArrival() {
        return arrival;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Flight flight = (Flight) o;

        if (!Objects.equals(departure, flight.departure)) return false;
        return Objects.equals(arrival, flight.arrival);
    }

    @Override
    public int hashCode() {
        int result = departure != null ? departure.hashCode() : 0;
        result = 31 * result + (arrival != null ? arrival.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Flight from " + departure + " to " + arrival;
    }
}
