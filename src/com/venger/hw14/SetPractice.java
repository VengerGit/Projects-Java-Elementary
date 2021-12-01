package com.venger.hw14;


import java.util.*;

public class SetPractice {

    public Set<String> convertToUnique(List<String> inputString) {
        return new LinkedHashSet<>(inputString);
    }

    public Set<Integer> getSortedUniqueIntegersASC(List<Integer> inputInteger) {
        Set<Integer> sortedSet = new TreeSet<>(Comparator.naturalOrder());
        sortedSet.addAll(inputInteger);
        return sortedSet;
    }

    public Set<Integer> getSortedUniqueIntegersDESC(List<Integer> inputInteger) {
        Set<Integer> sortedSet = new TreeSet<>(Comparator.reverseOrder());
        sortedSet.addAll(inputInteger);
        return sortedSet;
    }

    public Set<String> buildSentenceDirection(List<String> inputString) {
        return new LinkedHashSet<>(inputString);
    }
}
    