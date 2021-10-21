package com.venger.hw5.Task2;

public class ReverseString {

    public static void main(String[] args) {
        String test = "man has dog";
        System.out.println("input String:" + test);
        System.out.println("output String:" + reverse(test));
    }

    public static String reverse(String input) {
        String[] strings = input.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (int i = strings.length - 1; i >= 0; i--) {
            sb.append(strings[i] + " ");
        }
        return sb.toString().trim();
    }
}