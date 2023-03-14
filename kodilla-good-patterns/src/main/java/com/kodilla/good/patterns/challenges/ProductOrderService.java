package com.kodilla.good.patterns.challenges;

public class ProductOrderService implements OrderService {


    @Override
    public boolean order(Buyer buyer, Product product) {
        System.out.println("Checking if " + product.getIdNumber() + " is available in store  and making order for " + buyer.getName());
        return true;
    }
}
