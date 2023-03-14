package com.kodilla.good.patterns.challenges;

public class OrderProcessor {
    private OrderDatabase orderDatabase;
    private OrderService orderService;
    private ShippingService shippingService;

    public OrderProcessor(OrderDatabase orderDatabase, OrderService orderService, ShippingService shippingService) {
        this.orderDatabase  = orderDatabase;
        this.orderService = orderService;
        this.shippingService = shippingService;
    }
    public OrderDto process(OrderRequest orderRequest) {
        boolean isOrdered = orderService.order(orderRequest.getBuyer(), orderRequest.getProduct());
        if(isOrdered) {
           shippingService.ship(orderRequest.getBuyer(), orderRequest.getProduct());
           orderDatabase.createOrder(orderRequest.getBuyer(), orderRequest.getProduct());
           return new OrderDto(orderRequest.getBuyer(), true);
            } else {
            return new OrderDto(orderRequest.getBuyer(), false);

        }
    }
}
