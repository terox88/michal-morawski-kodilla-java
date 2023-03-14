package com.kodilla.good.patterns.challenges;

public class Product {

    private String idNumber;
    private int volume;
    private double price;

    public Product(String idNumber, int volume, double price) {
        this.idNumber = idNumber;
        this.volume = volume;
        this.price = price;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public int getVolume() {
        return volume;
    }

    public double getPrice() {
        return price;
    }
}
