package com.github.dejvvit13.day1;

import java.util.HashSet;

//This problem was recently asked by Google.
//Given a list of numbers and a number k, return whether any two numbers from the list add up to k.
//For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.
public class Day1Problem {

    public static void main(String[] args) {
        int[] array = {10, 15, 3, 7};
        System.out.println(solve(array, 17));
        System.out.println(solve2(array,17));
    }

    private static boolean solve(int[] numbers, int k) {

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - 1; i++) {
                if ((numbers[i] + numbers[j] == k)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean solve2(int[] numbers, int k) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : numbers) {
            int complement = k - num;
            if (set.contains(complement)) {
                return true;
            }
            set.add(num);
        }
        return false;
    }


}
