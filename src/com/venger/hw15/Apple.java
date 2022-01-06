package com.venger.hw15;

public class Apple implements Fruit {
    private String brand;

    public Apple(String brand) {
        this.brand = brand;
    }

    @Override
    public float getWeight() {
        return 1.0F;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "brand='" + brand + '\'' +
                '}';
    }
}
