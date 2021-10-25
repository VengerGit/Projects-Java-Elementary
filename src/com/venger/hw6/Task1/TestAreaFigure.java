package com.venger.hw6.Task1;

public class TestAreaFigure {
    public static void main(String[] args) {
        GeometricFigure[] arrayFigure = new GeometricFigure[3];

        arrayFigure[0] = new Circle(10.5);
        arrayFigure[1] = new Triangle(2.5, 5.5);
        arrayFigure[2] = new Square(5.6);

        for (int i = 0; i < arrayFigure.length; i++) {
            arrayFigure[i].figureArea();
            System.out.println(arrayFigure[i].toString());
        }
        System.out.println("Сумарная площадь фигур:" + getAreaAllFigures(arrayFigure));
    }

    public static double getAreaAllFigures(GeometricFigure[] arrayFigure) {
        double areaAllFigures = 0;
        for (int i = 0; i < arrayFigure.length; i++) {
            areaAllFigures += arrayFigure[i].figureArea();
        }
        return areaAllFigures;
    }
}