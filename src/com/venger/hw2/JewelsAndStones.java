package com.venger.hw2;

/*
Метод должен вернуть количество драгоценых камней в строке stones.
 */

import java.util.HashSet;
import java.util.Set;

class JewelsAndStones {

    public static void main(String[] args) {
        String jewels1 = "aA";
        String stones1 = "aAAbbbb";

        String jewels2 = "z";
        String stones2 = "ZZ";

        System.out.println(numJewelsInStones(jewels1, stones1));
        System.out.println(numJewelsInStones(jewels2, stones2));

    }

    public static int numJewelsInStones(String jewel, String stone) {
        Set<Character> jewels = new HashSet<>();
        for (int j = 0; j < jewel.length(); j++) {
            jewels.add(jewel.charAt(j));
        }
        int answer = 0;
        for (int i = 0; i < stone.length(); i++) {
            if (jewels.contains(stone.charAt(i))) {
                answer++;
            }
        }
        return answer;
    }
}