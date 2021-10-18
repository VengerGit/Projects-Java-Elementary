package com.venger.hw5.Task1.vehicles;

import com.venger.hw5.Task1.details.Engine;
import com.venger.hw5.Task1.professions.Driver;

public class SportCar extends Car {
    private double speed;

    public SportCar(String marka, String carClass, double weight, Engine engine, Driver driver, double speed) {
        super(marka, carClass, weight, engine, driver);
        this.speed = speed;
    }

    @Override
    public String toString() {
        return super.toString() + "SportCar speed:" + speed;
    }
}