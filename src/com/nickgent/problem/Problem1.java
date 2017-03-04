package com.nickgent.problem;

public class Problem1 {
    public static void solve(int numbersBelowThis) {
        long begin = System.currentTimeMillis();

        int three = 3;
        int five = 5;
        long sum = 0;
        while (three < numbersBelowThis || five < numbersBelowThis) {
            if (three < numbersBelowThis) {
                sum += three;
                three += 3;
            }
            if (five < numbersBelowThis) {
                if (five % 3 == 0) {
                    five += 5;
                    continue;
                }

                sum += five;
                five += 5;
            }
        }

        long end = System.currentTimeMillis();
        System.out.println("Sum: " + sum);
        System.out.println("Sum took " + (end-begin) + " milliseconds to find.");
    }
}
