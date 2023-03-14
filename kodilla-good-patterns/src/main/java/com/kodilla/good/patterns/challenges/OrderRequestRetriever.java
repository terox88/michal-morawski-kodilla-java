package com.kodilla.good.patterns.challenges;

public class OrderRequestRetriever {
    public OrderRequest retrieve() {
        Buyer buyer = new Buyer("Adam", "From Bible", "Eden");
        Product product = new Product("Apple-1", 100, 6.66);
        return new OrderRequest(buyer, product);
    }
}
