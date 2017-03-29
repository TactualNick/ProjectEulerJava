package com.nickgent.problem;

public class Problem3 {
    public static void findLargestPrimeFactor(long number) {
        long start = System.currentTimeMillis();
        for (long i = number; i > 0; i--) {
            if (number % i == 0 && isPrime(i)) {
                long end = System.currentTimeMillis();
                System.out.println("The largest prime number of " + number + " is " + i + ". Problem took " + ((end - start)/1000) + " seconds to solve.");
                return;
            }
        }
        long end = System.currentTimeMillis();
        System.out.println("No largest prime found. Problem took " + ((end - start)/1000) + " seconds to solve.");
    }

    private static boolean isPrime(long number) {
        for (long i = 2; i <= Math.floor(number / 2); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}
