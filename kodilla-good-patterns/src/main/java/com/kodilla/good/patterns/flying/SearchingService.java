package com.kodilla.good.patterns.flying;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SearchingService {
    private List<Flight> database;

    public SearchingService(List<Flight> database) {
        this.database = database;
    }

    public List<Flight> findFlightsFromCity(String city) {
        return database.stream().filter(f -> f.getDeparture().equals(city)).collect(Collectors.toList());
    }
    public List<Flight> findFlightsToCity(String city) {
        return database.stream().filter(f -> f.getArrival().equals(city)).collect(Collectors.toList());
    }
    public List<ChangeFlights> findFlightsWithChange(String departure, String arrival) {
        List<ChangeFlights> flights = new ArrayList<>();
        for(Flight first : findFlightsFromCity(departure)) {
            for(Flight second : findFlightsToCity(arrival)) {
                if(first.getArrival().equals(second.getDeparture()) && second.getArrival().equals(arrival)) {
                    flights.add(new ChangeFlights(first, second));
                }
            }
        }
        return flights;
    }

}
