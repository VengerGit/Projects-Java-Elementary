package com.venger.hw6.Task1;

public class Circle implements GeometricFigure {
    public static final double PI = 3.14;
    private double radiusCircle;

    public Circle(double radiusCircle) {
        this.radiusCircle = radiusCircle;
    }

    @Override
    public double figureArea() {
        return PI * (radiusCircle * radiusCircle);
    }

    @Override
    public String toString() {
        return "Circle, " +
                "areaCircle = " + figureArea() +
                '.';
    }
}