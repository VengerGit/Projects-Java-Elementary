package com.venger.hw12;

import java.util.LinkedList;
import java.util.Random;

public class Main {
    private static Random random = new Random();

    public static void main(String[] args) {
        LinkedList<String> inputList = new LinkedList<>();
        String input1 = "Animal";
        String input2 = "Brave";

        inputList.add("Axe");
        inputList.add("Anger");
        inputList.add("Government");
        inputList.add("Barbeshop");

        LinkedList<Integer> firstList = new LinkedList<>();
        LinkedList<Integer> secondList = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            firstList.add(i, random.nextInt(20));
            secondList.add(i, random.nextInt(20));
        }

        LinkedList<Integer> inputListInt = new LinkedList<>();
        for (int i = 0; i < 15; i++) {
            inputListInt.add(i, random.nextInt(20));
        }

        System.out.println("========================");
        LinkedList2a linkedList2a = new LinkedList2a();
        linkedList2a.addFirst(inputList, input1);
        System.out.println(inputList);
        System.out.println("========================");
        linkedList2a.addLast(inputList, input2);
        System.out.println(inputList);
        System.out.println("========================");
        System.out.println("First list: " + firstList + " Second list: " + secondList);
        System.out.println(linkedList2a.join(firstList, secondList));
        System.out.println("========================");
        System.out.println("Input list integer: " + inputListInt);
        System.out.print("Shuflle: ");
        linkedList2a.shuffle(inputListInt);
        System.out.println("========================");
        System.out.println("First list: " + firstList + " Second list: " + secondList);
        System.out.print("Intersect: ");
        System.out.println(linkedList2a.intersect(firstList, secondList));
    }
}