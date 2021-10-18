package com.venger.hw5.Task1;

import com.venger.hw5.Task1.details.Engine;
import com.venger.hw5.Task1.professions.Driver;
import com.venger.hw5.Task1.vehicles.Car;
import com.venger.hw5.Task1.vehicles.Lorry;
import com.venger.hw5.Task1.vehicles.SportCar;

public class Main {
    public static void main(String[] args) {
        Driver myCar = new Driver(28, "Venher Dmitriy Olegovich", 3);
        Engine bmwEngine = new Engine(360, "BMW");
        Car car = new Car("BMW", "A", 2_000.00d, bmwEngine, myCar);

        Driver lorryDriver = new Driver(65, "Petrov Grigorii Ivanovich", 20);
        Engine lorryEngine = new Engine(500, "Volvo");
        Lorry lorry = new Lorry("Volvo", "D", 8_500.00d, lorryEngine, lorryDriver, 18_000);

        Driver sportDriver = new Driver(18, "Maslov Leonid Igorevich", 1);
        Engine sportEngine = new Engine(300, "Ferrari");
        SportCar sportCar = new SportCar("Ferrari", "C", 1_500.00d, sportEngine, sportDriver, 340.50d);


        System.out.println(car);
        System.out.println("===================");
        System.out.println(lorry);
        System.out.println("===================");
        System.out.println(sportCar);


    }
}
