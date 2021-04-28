package com.paulinavelazquez;

public class PerfectNumber {
    public static void main(String[] args) {
        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(5));
        System.out.println(isPerfectNumber(-1));
        System.out.println(isPerfectNumber(33550336));
    }

    public static boolean isPerfectNumber(int number) {
        boolean isPerfectNumber = false;

        if (number < 1) {
            return false;
        }

        int divisor = 0;

        for (int i = 1; i <= number - 1; i++) {
            if (number % i == 0) {
                divisor += i;
            }
        }

        if (divisor == number) {
            isPerfectNumber = true;
        } else {
            isPerfectNumber = false;
        }

        return isPerfectNumber;
    }
}
