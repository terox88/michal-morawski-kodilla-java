package com.kodilla.good.patterns.challenges;

public class PrePaidShippingService implements ShippingService{
    @Override
    public boolean ship(Buyer buyer, Product product) {
        System.out.println("Checking if " + product.getPrice() + " was paid and if true create sending request to");
        System.out.println(buyer);
        return true;
    }
}
