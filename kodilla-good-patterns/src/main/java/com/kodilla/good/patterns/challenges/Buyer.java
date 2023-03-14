package com.kodilla.good.patterns.challenges;

public class Buyer {
    private String name;
    private String surname;
    private String address;

    public Buyer(String name, String surname, String address) {
        this.name = name;
        this.surname = surname;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return name + " " + surname  +"\n" +  address;
    }
}
