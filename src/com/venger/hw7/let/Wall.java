package com.venger.hw7.let;

import com.venger.hw7.participant.Athletes;

public class Wall implements Obstacle {
    private String name;
    private double height;

    public Wall(String name, double height) {
        this.name = name;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public String overcome(Athletes athletes) {
        athletes.jump();
        athletes.setSuccess(athletes.getMaxHeight() >= height);
        if (athletes.isSuccess()) {
            athletes.countPassed();
            return "Участник [" + athletes.getName() + "] " +
                    "прошел припятсвие: [" + getName() + "] на дистанции[" + getHeight() + "]";
        } else {
            return "Участник [" + athletes.getName() + "] " +
                    "не прошел припятсвие: [" + getName() + "]" + " на дистанции[" + getHeight() + "]" + "." + "Пройдено ["
                    + athletes.getPassed() + "]";
        }
    }
}
