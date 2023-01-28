package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public final class Continent {
    private  final String name;
    private final List<Country> countryList;

    public Continent(final String name, final List<Country> countryList) {
        this.name = name;
        this.countryList = countryList;
    }

    public String getName() {
        return name;
    }
    public List<Country> getCountryList() {
        return new ArrayList<>(countryList);
    }
}
