package com.kodilla.good.patterns.challenges;

public class ProductOrderDatabase implements OrderDatabase{
    @Override
    public boolean createOrder(Buyer buyer, Product product) {
        System.out.println("Add to database order ready to sending");
        return true;
    }
}
