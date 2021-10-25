package com.venger.hw6.Task1;

public class Square implements GeometricFigure {
    private double sideSquare;
    private double areaSquare;

    public Square(double sideSquare) {
        this.sideSquare = sideSquare;
    }

    @Override
    public double figureArea() {
        return areaSquare = sideSquare * sideSquare;
    }

    @Override
    public String toString() {
        return "Square, " +
                "areaSquare = " + figureArea() +
                '.';
    }
}