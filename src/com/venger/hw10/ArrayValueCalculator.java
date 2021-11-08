package com.venger.hw10;

public class ArrayValueCalculator {

    public int doCalc(String[][] input) throws MyArraySizeException, MyArrayDataException {
        checkArraySize(input);
        int sum = 0;
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[i].length; j++) {
                try {
                    sum += Integer.parseInt(input[i][j]);
                } catch (NumberFormatException ex) {
                    throw new MyArrayDataException(String.format("incorrect data in the cell[%d][%d]", i, j), ex);
                }
            }
        }
        return sum;
    }

    private void checkArraySize(String[][] input) throws MyArraySizeException {
        checkArraySize(input.length);
        for (int i = 0; i < input[i].length-1; i++) {
            checkArraySize(input[i].length);
        }
    }

    private void checkArraySize(int length) throws MyArraySizeException {
        if (length != 4) {
            throw new MyArraySizeException("Array  must be 4x4");
        }
    }
}