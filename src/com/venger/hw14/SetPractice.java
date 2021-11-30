package com.venger.hw14;


import java.util.*;

public class SetPractice {

    public Set<String> convertToUnique(List<String> inputString) {
        return new LinkedHashSet<>(inputString);
    }

    public Set<Integer> getSortedUniqueIntegersASC(List<Integer> inputInteger) {
        Set<Integer> sortedSet = new TreeSet<Integer>(new Comparator<Integer>() {
            public int compare(Integer o1, Integer o2) {
                return o1.toString().compareTo(o2.toString());
            }
        });
        sortedSet.addAll(inputInteger);
        return sortedSet;
    }

    public Set<Integer> getSortedUniqueIntegersDESC(List<Integer> inputInteger) {
        Set<Integer> sortedSet = new TreeSet<Integer>(new Comparator<Integer>() {
            public int compare(Integer o1, Integer o2) {
                return o2.toString().compareTo(o1.toString());
            }
        });
        sortedSet.addAll(inputInteger);
        return sortedSet;
    }

    public Set<String> buildSentenceDirection(List<String> inputString) {
        return new LinkedHashSet<>(inputString);
    }
}
    