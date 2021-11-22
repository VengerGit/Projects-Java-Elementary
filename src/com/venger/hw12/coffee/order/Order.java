package com.venger.hw12.coffee.order;

public class Order {
    private String name;
    private int orderNumber;

    public Order(String name, int orderNumber) {
        this.name = name;
        this.orderNumber = orderNumber;
    }

    public String getName() {
        return name;
    }

    public int getOrderNumber() {
        return orderNumber;
    }
}
