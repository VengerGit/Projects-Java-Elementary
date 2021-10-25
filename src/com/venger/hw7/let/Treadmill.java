package com.venger.hw7.let;

import com.venger.hw7.participant.Athletes;

public class Treadmill implements Obstacle {
    private String name;
    private double length;

    public Treadmill(String name, double length) {
        this.name = name;
        this.length = length;
    }

    public String getName() {
        return name;
    }

    public double getLength() {
        return length;
    }

    @Override
    public String overcome(Athletes athletes) {
        athletes.run();
        athletes.setSuccess(athletes.getMaxLength() >= length);
        if (athletes.isSuccess()) {
            athletes.countPassed();
            return "Участник [" + athletes.getName() + "] " +
                    "прошел припятсвие: [" + getName() + "] на дистанции[" + getLength() + "]";
        } else {
            return "Участник [" + athletes.getName() + "] " +
                    "не прошел припятсвие: [" + athletes.getName() + "]" + " на дистанции[" + getLength() + "]" + "." + "Пройдено ["
                    + athletes.getPassed() + "]";
        }
    }
}
