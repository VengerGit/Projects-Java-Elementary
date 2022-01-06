package com.venger.hw15;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String[] orders = new String[4];
        orders[0] = "Hillel";
        orders[1] = "Karavan";
        orders[2] = "MostCity";
        orders[3] = "OceanPlaza";
        System.out.println(toList(orders));

        Box<Apple> oneApple = new Box<>();
        System.out.println(oneApple.addFruitToBox(new Apple("Gala")));
        System.out.println(oneApple.getWeight());

        Box<Apple> muchApple = new Box<>();
        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple("Gala"));
        apples.add(new Apple("Geneva"));
        apples.add(new Apple("Red Delicious"));
        System.out.println(muchApple.addFruitsToBox(apples));
        System.out.println(muchApple.getWeight());

        Box<Orange> muchOrange = new Box<>();
        List<Orange> oranges = new ArrayList<>();
        oranges.add(new Orange("Hamlin"));
        oranges.add(new Orange("Verna"));
        oranges.add(new Orange("Salistiana"));
        System.out.println(muchOrange.addFruitsToBox(oranges));
        System.out.println(muchOrange.getWeight());

        System.out.println(muchOrange.compare(muchApple));

        List<Orange> orangeMerge = new ArrayList<>();
        orangeMerge.add(new Orange("Washingtoh Navel"));
        orangeMerge.add(new Orange("Navel Late"));
        orangeMerge.add(new Orange("Navelina"));

        Box<Orange> mergeOrange = new Box<>();
        mergeOrange.addFruitsToBox(orangeMerge);
        muchOrange.merge(mergeOrange);
        System.out.println(muchOrange);
        System.out.println(mergeOrange);

    }

    public static <E> List<E> toList(E[] element) {
        return List.of(element);
    }
}
