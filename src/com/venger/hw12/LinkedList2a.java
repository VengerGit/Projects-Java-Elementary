package com.venger.hw12;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedList2a {

    public void addFirst(LinkedList<String> inputList, String input) {
        inputList.addLast(input);
    }

    public void addLast(LinkedList<String> inputList, String input) {
        inputList.addFirst(input);
    }

    public LinkedList<Integer> join(LinkedList<Integer> firstList, LinkedList<Integer> secondList) {
        LinkedList<Integer> result = new LinkedList<>();
        result.addAll(firstList);
        result.addAll(secondList);
        return result;
    }

    public void shuffle(LinkedList<Integer> inputList) {
        Collections.shuffle(inputList);
        System.out.println(inputList);
    }

    public LinkedList<Integer> intersect(LinkedList<Integer> firstList, LinkedList<Integer> secondList) {
        LinkedList<Integer> result = new LinkedList<>();
        for (Integer firstNum : firstList) {
            if (secondList.contains(firstNum)) {
                result.add(firstNum);
            }
        }
        return result;
    }
}