package com.venger.hw12.coffee.order;

import java.util.Iterator;
import java.util.LinkedList;

public class CoffeeOrderBoard {
    private LinkedList<Order> orderList;
    private int naturalOrdering = 1;

    public CoffeeOrderBoard() {
        this.orderList = new LinkedList<>();
    }

    public LinkedList<Order> add(String name) {
        orderList.add(new Order(name, naturalOrdering++));
        return orderList;
    }

    public Order deliver() {
        return orderList.removeFirst();
    }

    public Order deliver(int num) {
        return orderList.remove(num);
    }

    public LinkedList<Order> getOrderList() {
        return orderList;
    }

    public void draw() {
        System.out.println("==========================");
        System.out.println("\tNum" + "\t| " + "\tName");
        Iterator<Order> iterator = orderList.iterator();
        while (iterator.hasNext()) {
            Order orders = iterator.next();
            StringBuilder order = new StringBuilder();
            System.out.println("\t " + order.append(orders.getOrderNumber() + "\t|" + "\t " + orders.getName()));
        }
    }
}