package com.kodilla.good.patterns.challenges;

public class OrderDto {
    Buyer buyer;
    boolean isOrdered;

    public OrderDto(Buyer buyer, boolean isOrdered) {
        this.buyer = buyer;
        this.isOrdered = isOrdered;
    }

    public Buyer getBuyer() {
        return buyer;
    }

    public boolean isOrdered() {
        return isOrdered;
    }
}
