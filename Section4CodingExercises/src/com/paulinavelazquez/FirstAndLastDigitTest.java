package com.paulinavelazquez;

public class FirstAndLastDigitTest {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLast(587));
    }

    public static int sumFirstAndLast(int number) {

        int total = 0;
        int lastDigit = number % 10;
        System.out.println("Last digit: " + lastDigit);
        while (number >= 10) {
            number = number / 10;
        }
        System.out.println("First digit: " + number);
        return total;
    }
}
