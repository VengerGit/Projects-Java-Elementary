package com.venger.hw15;

public class Orange implements Fruit {
    private String brand;

    public Orange(String brand) {
        this.brand = brand;
    }

    @Override
    public float getWeight() {
        return 1.5F;
    }

    @Override
    public String toString() {
        return "Orange{" +
                "brand='" + brand + '\'' +
                '}';
    }
}
