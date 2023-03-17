package com.kodilla.good.patterns.food.delivery;

public class GlutenFreeShop implements Producer {
    @Override
    public boolean process(Order order) {
        if(order.getProducer().getClass() != this.getClass()) {
            System.out.println("Order rejected");
            return false;
        } else {
            System.out.println("Deliver and store only with another gluten free products");
            return true;
        }
    }
}
