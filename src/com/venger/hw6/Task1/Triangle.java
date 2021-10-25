package com.venger.hw6.Task1;

public class Triangle implements GeometricFigure {
    public static final double TRIANGLE = 0.5;
    private double baseTriangle;
    private double heightTriangle;

    public Triangle(double baseTriangle, double heightTriangle) {
        this.baseTriangle = baseTriangle;
        this.heightTriangle = heightTriangle;
    }

    @Override
    public double figureArea() {
        return TRIANGLE * baseTriangle * heightTriangle;
    }

    @Override
    public String toString() {
        return "Triangle, " +
                "areaTriangle = " + figureArea() +
                '.';
    }
}