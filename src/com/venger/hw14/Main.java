package com.venger.hw14;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        SetPractice setPractice = new SetPractice();
        List<String> input = new LinkedList<>();
        input.add("Привет");
        input.add("Мир");
        input.add("Привет");
        input.add("!");

        System.out.println(setPractice.convertToUnique(input));

        List<Integer> inputInteger = List.of(44, 75, 30, 35, 22, 11);
        System.out.println(setPractice.getSortedUniqueIntegersASC(inputInteger));

        System.out.println(setPractice.getSortedUniqueIntegersDESC(inputInteger));

        System.out.println(setPractice.buildSentenceDirection(input));
    }
}
