package com.venger.hw5.Task1.details;

public class Engine {
    private int power;
    private String company;

    public Engine(int power, String company) {
        this.power = power;
        this.company = company;
    }

    @Override
    public String toString() {
        return "Engine:" +
                "power:" + power +
                ",company:" + company;
    }
}