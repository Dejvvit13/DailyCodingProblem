package com.github.dejvvit13.day2;

//        Given an array of integers, return a new array such that each element at index i of the new array is the product of all the numbers in the original array except the one at i.
//        For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24]. If our input was [3, 2, 1], the expected output would be [2, 3, 6].

import java.util.Arrays;

public class Day2Problem {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {3, 2, 1};
        System.out.println(Arrays.toString(solve(arr1)));
        System.out.println(Arrays.toString(solve(arr2)));
        System.out.println(Arrays.toString(solve2(arr1)));
        System.out.println(Arrays.toString(solve2(arr2)));
    }

    public static int[] solve(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int sum = 1;
            for (int j = 0; j < nums.length; j++) {
                if (j != i) {
                    sum *= nums[j];
                }
            }
            result[i] = sum;
        }
        return result;
    }

    public static int[] solve2(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int sum = 1;

        for (int i = 0; i < n; i++) {
            sum *= nums[i];
        }

        for (int i = 0; i < n; i++) {
            result[i] = sum / nums[i];
        }

        return result;
    }


}
