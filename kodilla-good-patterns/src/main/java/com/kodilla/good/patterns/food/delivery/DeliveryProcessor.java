package com.kodilla.good.patterns.food.delivery;

public class DeliveryProcessor {


    public boolean deliveryProcess(Order order) {
        Producer producer = order.getProducer();
        return producer.process(order);
    }
}
