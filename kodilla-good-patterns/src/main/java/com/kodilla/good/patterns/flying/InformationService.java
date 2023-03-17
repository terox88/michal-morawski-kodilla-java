package com.kodilla.good.patterns.flying;

import java.util.List;

public class InformationService {
    public void displayFlights (List<?> flights) {
        flights.stream().forEach(System.out :: println);
    }
}
