package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightSearch {

    public String findFlight(Flight flight) throws RouteNotFoundException {

        Map<String, Boolean> destinationDatabase = new HashMap<>();
        destinationDatabase.put("Cracow", true);
        destinationDatabase.put("Warsaw", true);
        destinationDatabase.put("Berlin", true);
        destinationDatabase.put("Kozia Wólka", false);
        destinationDatabase.put("Madrid", true);

        if(!destinationDatabase.containsKey(flight.getArrivalAirport())) throw new RouteNotFoundException();

        boolean isRouteExists = destinationDatabase.get(flight.getArrivalAirport());

        if(isRouteExists) {
            return "You can get with us to: " + flight.getArrivalAirport();
        }
        return "Sorry we don' t have this destination in our offer but we are working on it.";
    }
}
