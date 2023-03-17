package com.kodilla.good.patterns.food.delivery;

public class ExtraFoodShop implements Producer{
    @Override
    public boolean process(Order order) {
        if(order.getProducer().getClass() != this.getClass()) {
            System.out.println("Order rejected");
            return false;
        } else {
           if (order.getProduct().getProductCategory() < 4 && order.getQuantity() < 10) {System.out.println("Pick up by bike");
           } else {System.out.println("Pick up by car");}
           return true;
        }

    }
}
