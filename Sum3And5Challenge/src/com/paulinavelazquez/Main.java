package com.paulinavelazquez;


public class Main {
    public static void main(String[] args) {
        isDivisibleNumber();
    }

    public static void isDivisibleNumber() {
        int count = 0;
        int sum = 0;
        for (int i = 1; i < 1000; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println("Found number: "+i);
                count++;
                sum += i;
            }

            if (count == 5) {
                break;
            }
        }
        System.out.println("Sum: "+sum);
    }
}
