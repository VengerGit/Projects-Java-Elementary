package com.venger.hw6.Task1;

/*
1) Создать базовый интерфейс для геометрической фигуры, в котором есть метод который возвращает площадь фигуры.
Создать 3 класса которые реализуют этот интерфейс: круг, треугольник, квадрат.
Создать массив фигур, и написать метод который выведет суммарную площадь всех фигур в этом массиве.
 */

public interface GeometricFigure {
    double figureArea();
}