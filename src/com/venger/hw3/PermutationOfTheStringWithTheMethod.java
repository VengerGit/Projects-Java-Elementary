package com.venger.hw3;

/*
4*) Написать метод у которого 2 входящих параметра типа String.
Метод должен вернуть true если путем перестановки символов можно из первой строки получить вторую. Например:
"asdf", "fdsa" => true
"asdf", "asdfg" => false
"aab", "bba" => false
 */

import java.util.Arrays;

public class PermutationOfTheStringWithTheMethod {

    public static void main(String[] args) {
        String first = "asdf";
        String second = "fdsa";
        String first1 = "asdf";
        String second1 = "asdfg";
        String first2 = "aab";
        String second2 = "bba";
        System.out.println(checkAnagram(first, second));
        System.out.println(checkAnagram(first1, second1));
        System.out.println(checkAnagram(first2, second2));
    }

    public static boolean checkAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        } else {
            char[] a = str1.toCharArray();
            char[] b = str2.toCharArray();
            Arrays.sort(a);
            Arrays.sort(b);
            return Arrays.equals(a, b);
        }
    }
}