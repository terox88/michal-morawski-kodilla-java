package com.kodilla.good.patterns.food.delivery;

import java.util.Objects;

public class Order {
   private Product product;
   private Producer producer;
   private double quantity;

    public Order(Product product, Producer producer, double quantity) {
        this.product = product;
        this.producer = producer;
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public Producer getProducer() {
        return producer;
    }

    public double getQuantity() {
        return quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Order order = (Order) o;

        if (Double.compare(order.quantity, quantity) != 0) return false;
        if (!Objects.equals(product, order.product)) return false;
        return Objects.equals(producer, order.producer);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = product != null ? product.hashCode() : 0;
        result = 31 * result + (producer != null ? producer.hashCode() : 0);
        temp = Double.doubleToLongBits(quantity);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
