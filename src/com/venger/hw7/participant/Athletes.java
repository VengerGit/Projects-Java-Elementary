package com.venger.hw7.participant;

/*
1. Создайте тип данных Участник и несколько его реализаций: Человек, Кот, Робот.
2. Классы из п.1 должны обладать поведением бегать и прыгать (методы просто выводят информацию о действии в консоль).
 */

public interface Athletes {
    String getName();

    double getMaxLength();

    double getMaxHeight();

    boolean isSuccess();

    void setSuccess(boolean success);

    void countPassed();

    int getPassed();

    void run();

    void jump();
}
