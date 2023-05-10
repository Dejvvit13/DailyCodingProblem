package com.github.dejvvit13.day5;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Day5Problem {

    public static void main(String[] args) {
        Function<BiFunction<Integer, Integer, ?>, ?> pair = cons(3, 4);
        int first = (int) pair.apply((a, b) -> a);
        int second = (int) pair.apply((a, b) -> b);
        System.out.println(first);
        System.out.println(second);
    }

    public static <T, U> Function<BiFunction<T, U, ?>, ?> cons(T a, U b) {
        return f -> f.apply(a, b);
    }

}
