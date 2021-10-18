package com.venger.hw5.Task1.vehicles;

import com.venger.hw5.Task1.details.Engine;
import com.venger.hw5.Task1.professions.Driver;

public class Lorry extends Car {
    private int carrying;


    public Lorry(String marka, String carClass, double weight, Engine engine, Driver driver, int carrying) {
        super(marka, carClass, weight, engine, driver);
        this.carrying = carrying;
    }

    @Override
    public String toString() {
        return super.toString() + "Lorry carrying:" + carrying;
    }
}