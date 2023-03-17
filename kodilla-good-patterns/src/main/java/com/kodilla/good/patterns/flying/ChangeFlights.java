package com.kodilla.good.patterns.flying;

public class ChangeFlights {
    private Flight first;
    private Flight second;

    public ChangeFlights(Flight first, Flight second) {
        this.first = first;
        this.second = second;
    }

    public Flight getFirst() {
        return first;
    }

    public Flight getSecond() {
        return second;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ChangeFlights that = (ChangeFlights) o;

        if (first != null ? !first.equals(that.first) : that.first != null) return false;
        if (second != null ? !second.equals(that.second) : that.second != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = first != null ? first.hashCode() : 0;
        result = 31 * result + (second != null ? second.hashCode() : 0);
        return result;
    }
    @Override
    public String toString () {
        return "Flight from " + first.getDeparture() + " to " + second.getArrival() + " by " + first.getArrival();
    }
}
