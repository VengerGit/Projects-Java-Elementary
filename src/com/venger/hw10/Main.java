package com.venger.hw10;

public class Main {
    public static void main(String[] args) {
        ArrayValueCalculator calculator = new ArrayValueCalculator();

        String[][] input1 = {};
        String[][] input2 = {
                {"text", "2", "3", "12"},
                {"23", "21", "123", "55"},
                {"11", "01", "34", "11"},
                {"11", "01", "34", "11"}
        };
        String[][] input3 = {
                {"12", "2", "3", "12"},
                {"23", "21", "123", "55"},
                {"11", "01", "34", "A"},
                {"11", "01", "34", "11"}
        };
        String[][] input = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        try {
            System.out.println(calculator.doCalc(input1));
        } catch (MyArraySizeException | MyArrayDataException e) {
            e.printStackTrace();
        }
        try {
            System.out.println(calculator.doCalc(input2));
        } catch (MyArraySizeException | MyArrayDataException e) {
            e.printStackTrace();
        }
        try {
            System.out.println(calculator.doCalc(input3));
        } catch (MyArraySizeException | MyArrayDataException e) {
            e.printStackTrace();
        }
        try {
            System.out.println(calculator.doCalc(input));
        } catch (MyArraySizeException | MyArrayDataException e) {
            e.printStackTrace();
        }
    }
}