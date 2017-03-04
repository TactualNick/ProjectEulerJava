package com.nickgent.problem;

public class Problem2 {
    public static void solve(long numbersBelowThis) {
        long begin = System.currentTimeMillis();

        long first = 1;
        long second = 2;

        long sum = 0;
        while (second <= numbersBelowThis) {
            sum += (second % 2) == 0 ? second : 0;

            long newSecond = first + second;
            first = second;
            second = newSecond;
        }

        long end = System.currentTimeMillis();
        System.out.println("Sum: " + sum);
        System.out.println("Sum took " + (end-begin) + " milliseconds to find.");
    }
}
