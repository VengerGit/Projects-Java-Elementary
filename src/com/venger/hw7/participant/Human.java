package com.venger.hw7.participant;

import com.venger.hw7.participant.Athletes;

public class Human implements Athletes {
    private String name;
    private double maxLength;
    private double maxHeight;
    private boolean success = true;
    private int successCount = 0;

    public Human(String name, double maxLength, double maxHeight) {
        this.name = name;
        this.maxLength = maxLength;
        this.maxHeight = maxHeight;
    }

    @Override
    public void run() {
        System.out.println("Человек " + name + " может пробежать: " + maxLength + " м");
    }

    @Override
    public void jump() {
        System.out.println("Человек " + name + " может прыгнуть: " + maxHeight + " cм");
    }

    @Override
    public void countPassed() {
        successCount = successCount + 1;
    }

    @Override
    public int getPassed() {
        return successCount;
    }

    public String getName() {
        return name;
    }

    public double getMaxLength() {
        return maxLength;
    }

    public double getMaxHeight() {
        return maxHeight;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }
}
