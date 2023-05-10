package com.github.dejvvit13.day4;

//Given an array of integers, find the first missing positive integer in linear time and constant space.
//In other words, find the lowest positive integer that does not exist in the array. The array can contain duplicates and negative numbers as well.
//For example, the input [3, 4, -1, 1] should give 2. The input [1, 2, 0] should give 3.

import java.util.Set;
import java.util.TreeSet;

public class Day4Problem {

    public static void main(String[] args) {
        int[] array1 = {3, 4, -1, 1};
        int[] array2 = {1, 2, 0};
        int[] array3 = {-2, -3, -4, 3, 4, 5, 6, 9, 10};
        System.out.println(solve(array1));
        System.out.println(solve(array2));
        System.out.println(solve(array3));
    }

    public static int solve(int[] numbers) {
        Set<Integer> treeSet = new TreeSet<>();
        int next = 0;

        for (int num : numbers) {
            if (num > 0) treeSet.add(num);
        }

        for (final Integer integer : treeSet) {
            int actual = next;
            next = integer;
            if (next - actual > 1) {
                return actual + 1;
            }
        }
        return next + 1;
    }

}
