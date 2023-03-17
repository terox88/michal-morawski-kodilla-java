package com.kodilla.good.patterns.flying;

import java.util.ArrayList;
import java.util.List;

public class FlightDatabase {
    private List<Flight> database;

    public FlightDatabase () {
        database = new ArrayList<>();
        database.add(new Flight("Warsaw", "New York"));
        database.add(new Flight("Cracow", "Madrid"));
        database.add(new Flight("Barcelona", "Berlin"));
        database.add(new Flight("Berlin", "Oslo"));
        database.add(new Flight("Rome", "Warsaw"));
        database.add(new Flight("Warsaw", "Berlin"));
        database.add(new Flight("New York", "Cracow"));
    }

    public List<Flight> getDatabase() {
        return database;
    }
}
