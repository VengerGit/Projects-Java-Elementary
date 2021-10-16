package com.venger.hw4;

/*
Учитывая целочисленный массив nums, переместите все четные целые числа в начало массива,
а затем все нечетные целые числа.
 */

import java.util.Arrays;

public class SortArrayByParity {

    public static int[] sortArrayByParity(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n; j++) {
                if (nums[i] % 2 == 0) {
                    int tmp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = tmp;
                } else {
                    int tmp1 = nums[i];
                    nums[i] = nums[j];
                    nums[j] = tmp1;
                }
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {3, 1, 2, 4};
        int[] ans = sortArrayByParity(nums);
        int[] nums1 = {0};
        int[] ans1 = sortArrayByParity(nums1);
        System.out.println(Arrays.toString(ans));
        System.out.println(Arrays.toString(ans1));
    }
}