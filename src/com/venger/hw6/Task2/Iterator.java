package com.venger.hw6.Task2;

/*
2*) Написать класс Iterator. который в конструкторе принимает двумерный массив, в каждой строке которого элементы изначально отсортированы.
У Iterator есть 2 метода:
hasNext() - возвращает true если есть еще элементы.
next() - выводит следующий по значению элемент.
Не меняя метод main() Реализовать класс Iterator чтобы он вывел все элементы со всех массивов по порядку:
1, 1, 2, 2, 3, 3, 3, 5, 6, 7
 */

import java.util.Arrays;
import java.util.NoSuchElementException;

public class Iterator {
    private int[][] arr;
    private int size;
    private int position = 0;
    private int n = 0;
    private int m = 0;

    public Iterator(int[][] arr) {
        this.size = countElements(arr);
        this.arr = sortArr(arr);
    }

    private int countElements(int[][] arr) {
        int count = 0;
        for (int[] row : arr) {
            count += row.length;
        }
        return count;
    }

    private int[][] sortArr(int[][] arr) {
        int[] tmpArr = new int[size];
        int tmpElement = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                tmpArr[tmpElement++] = arr[i][j];
            }
        }
        Arrays.sort(tmpArr);
        tmpElement = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = tmpArr[tmpElement++];
            }
        }
        return arr;
    }

    public boolean hasNext() {
        return position < size;
    }

    public int next() {
        if (position >= size) {
            throw new NoSuchElementException();
        }
        int element = arr[n][m];
        position++;
        m++;
        while (n < arr.length && m >= arr[n].length) {
            m = 0;
            n++;
        }
        return element;
    }
}
