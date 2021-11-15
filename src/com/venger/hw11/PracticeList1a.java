package com.venger.hw11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PracticeList1a {

    public class Ocurence {
        private final String name;
        private final int occurance;

        public Ocurence(String name, int occurance) {
            this.name = name;
            this.occurance = occurance;
        }


        @Override
        public String toString() {
            return "Ocurence{" +
                    "name='" + name + '\'' +
                    ", occurance=" + occurance +
                    '}';
        }
    }

    public String findOccurance(List<String> input) {
        System.out.println(input);
        List<Ocurence> occurance = new ArrayList<>();
        for (String unique : input) {
            if (!occurance.contains(unique)) {
                occurance.add(new Ocurence(unique, Collections.frequency(input, unique)));
            }
        }
        return occurance.toString();
    }


    public void calcOccurance(List<String> input) {
        System.out.println(input);
        List<String> uniqueList = new ArrayList<>();
        for (String unique : input) {
            if (!uniqueList.contains(unique)) {
                uniqueList.add(unique);
                System.out.printf("%s: %-2d %n", unique, Collections.frequency(input, unique));
            }
        }
    }


    public List findUnique(List<Integer> input) {
        System.out.println(input);
        List<Integer> unique = new ArrayList<>();
        for (Integer number : input) {
            if (!unique.contains(number)) {
                unique.add(number);
            }
        }
        return unique;
    }

    public List toList(int[] input) {
        List<Integer> intList = new ArrayList<Integer>(input.length);
        for (int i : input) {
            intList.add(i);
        }
        return intList;
    }

    public int countOccurance(List<String> list, String input) {
        System.out.println(list);
        System.out.println(input);
        int count = 0;
        for (String inputs : list)
            if (inputs.startsWith(input)) {
                count++;
            }
        return count;
    }
}