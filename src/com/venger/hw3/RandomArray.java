package com.venger.hw3;

/*
2) Задан массив случаных чисел типа int в котором есть положительные и отрицательные числа.
Написать метод который вернет массив квадратов этих чисел, отсортированных по возрастанию.
 */

import java.util.Arrays;

public class RandomArray {

    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round((Math.random() * 30) - 15);
        }
        System.out.println(Arrays.toString(array));
        System.out.println("=========================================");
        System.out.println(Arrays.toString(doubleArrray(array)));
    }

    private static int[] doubleArrray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] * array[i];
        }
        for (int j = 0; j < array.length; j++) {
            for (int k = 0; k < array.length; k++) {
                if (array[j] < array[k]) {
                    int sort = array[j];
                    array[j] = array[k];
                    array[k] = sort;
                }
            }
        }
        return array;
    }
}