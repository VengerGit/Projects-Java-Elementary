package com.venger.hw5.Task1.vehicles;

import com.venger.hw5.Task1.details.Engine;
import com.venger.hw5.Task1.professions.Driver;

public class Car {
    private String marka;
    private String carClass;
    private double weight;
    private Engine engine;
    private Driver driver;

    public Car(String marka, String carClass, double weight, Engine engine, Driver driver) {
        this.marka = marka;
        this.carClass = carClass;
        this.weight = weight;
        this.engine = engine;
        this.driver = driver;
    }

    public void start() {
        System.out.println("Поехали");
    }

    public void stop() {
        System.out.println("Останавливаемся");
    }

    public void turnLeft() {
        System.out.println("Поворот  налево");
    }

    public void turnRight() {
        System.out.println("Поворот  направо");
    }

    @Override
    public String toString() {
        return "Car:" + "Marka(" + marka + ")" + "carClass(" + carClass + ')' + "weight:" + weight
                + "\n" + driver + "\n" + engine + '.';
    }
}