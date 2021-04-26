package com.paulinavelazquez;

public class Main {
    public static void main(String[] args) {

        System.out.println("For loop starting from 2% to 8%");
        for (int i = 2; i < 9; i++) {
            System.out.println("10,000 at " + i + " % interest = $" + String.format("%.2f", calculateInterest(10000, i)));
        }

        // For loop starting from 8% and work back to 2%
        System.out.println("\nFor loop starting from 8% to 2%");
        for (int i = 8; i >= 2; i--) {
            System.out.println("10,000 at " + i + " % interest = $" + String.format("%.2f", calculateInterest(10000, i)));
        }
    }

    public static double calculateInterest(double amount, double interest) {
        return (amount * (interest / 100));
    }
}
