package com.venger.hw3;

/*
3*) Задана строка. Вывести все перестановки этой строки.
Например для строки "abc":
abc, acb, bac, bca, cab, cba
 */

public class RearrangementOfTheString {

    public static void main(String[] args) {
        String rearrangement = "abc";
        permuteRearrangementOfTheString(rearrangement, "");
    }

    public static String reverseString(String beginning) {
        return beginning.substring(1) + beginning.charAt(0);
    }

    public static void permuteRearrangementOfTheString(String inputString, String answer) {
        if (inputString.length() == 0) {
            System.out.println(answer);
            return;
        }
        for (int i = 0; i < inputString.length(); i++) {
            permuteRearrangementOfTheString(inputString.substring(1), answer + inputString.charAt(0));
            inputString = reverseString(inputString);
        }
    }
}