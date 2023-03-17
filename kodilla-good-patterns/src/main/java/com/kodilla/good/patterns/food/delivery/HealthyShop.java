package com.kodilla.good.patterns.food.delivery;

public class HealthyShop  implements  Producer{
    @Override
    public boolean process(Order order) {
        if(order.getProducer().getClass() != this.getClass()) {
            System.out.println("Order rejected");
            return false;
        } else {
            if (order.getQuantity() < 10) {
                System.out.println("Order is too small");
                System.out.println("Order rejected");
                return false;
            } else {return  true;}

        }
    }
}
