package com.venger.hw15;

import java.util.ArrayList;
import java.util.List;

public class Box<E extends Fruit> {
    private List<E> fruits = new ArrayList<>();
    private static final float WEIGHT = 0.0F;

    public List<E> getFruits() {
        return fruits;
    }

    public List<E> addFruitToBox(E fruit) {
        fruits.add(fruit);
        return fruits;
    }

    public List<E> addFruitsToBox(List<E> fruitsAll) {
        fruits.addAll(fruitsAll);
        return fruits;
    }

    public float getWeight() {
        if (fruits.isEmpty()) {
            return WEIGHT;
        }
        for (E fruit : fruits) {
            if (fruit != null) {
                return fruit.getWeight() * fruits.size();
            }
        }
        return WEIGHT;
    }

    public boolean compare(Box<? extends Fruit> other) {
        return getWeight() == other.getWeight();
    }

    public void merge(Box<E> other) {
        fruits.addAll(other.getFruits());
        other.getFruits().clear();
    }

    @Override
    public String toString() {
        return "Box{" +
                "fruits=" + fruits +
                '}';
    }
}
