package com.venger.hw5.Task1.professions;

public class Driver extends Person {
    private int drivingExpirience;

    public Driver(int age, String fullname, int drivingExpirience) {
        super(age, fullname);
        this.drivingExpirience = drivingExpirience;
    }


    @Override
    public String toString() {
        return "Driver:" + super.toString() +
                ",drivingExpirience:" + drivingExpirience + ".";
    }
}
