package com.paulinavelazquez;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LargestPrime {
    public static void main(String[] args) {
        System.out.println(getLargestPrime(21));
        System.out.println(getLargestPrime(217));
        System.out.println(getLargestPrime(0));
        System.out.println(getLargestPrime(45));
        System.out.println(getLargestPrime(-1));
    }

    public static int getLargestPrime(int number) {
        int result = 0;

        List<Integer> Factors = new ArrayList<>();

        Factors.add(1);

        for (int i = 2; i <= number / 2; i++) {

            if (number % i == 0) {
                if (isPrime(i)) {
                    Factors.add(i);
                }
            }
        }

        result = Collections.max(Factors);

        if (number <= 0){
            result = -1;
        }
        return result;
    }

    public static boolean isPrime(int number) {
        boolean result = false;
        if (number > 1) {
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    return false;
                } else {
                    return true;
                }
            }
        }
        return result;
    }
}

