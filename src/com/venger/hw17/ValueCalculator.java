package com.venger.hw17;

import java.util.Arrays;

public class ValueCalculator {

    private final int SIZE = 1000000;
    private final int HALF = SIZE / 2;

    private final float[] arr = new float[SIZE];

    float[] a1 = new float[HALF];
    float[] a2 = new float[HALF];

    public void doCalc() {
        long start = System.currentTimeMillis();
        Arrays.fill(arr, 2);

        float[] a1 = new float[HALF];
        float[] a2 = new float[HALF];

        System.arraycopy(arr, 0, a1, 0, HALF);
        System.arraycopy(arr, HALF, a2, 0, HALF);

        Thread t0 = new Thread();
        Thread t1 = new Thread();

        t0.start();
        t1.start();

        try {
            t0.join();
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        long end = System.currentTimeMillis() - start;
        System.out.println("Operation took:" + end);

    }

    private Runnable getCalcOperation(float[] arr) {
        return new Runnable() {
            @Override
            public void run() {
                doCalc(arr);
            }
        };
    }

    private void doCalc(float[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) (arr[i] + Math.sin(0.2f + 1 / 5) * Math.cos(0.2f + 1 / 5) * Math.cos(0.4f + 1 / 2));
        }
    }
}