package com.paulinavelazquez;

public class Main {

    public static void main(String[] args) {

        System.out.println("Testing DigitCount method");
        System.out.println(getDigitCount(0));
        System.out.println(getDigitCount(123));
        System.out.println(getDigitCount(-12));
        System.out.println(getDigitCount(5200));

        System.out.println("Testing Reverse Method");
        System.out.println(reverse(-121));
        System.out.println(reverse(1212));
        System.out.println(reverse(1234));
        System.out.println(reverse(100));

        System.out.println("Testing numberToWords Method");
        numberToWords(123);
        numberToWords(1010);
        numberToWords(1000);
        numberToWords(-12);
        numberToWords(0);
    }

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        }

        int digitCount = getDigitCount(number);
        int wordCount = 0;
        int reversedNumber = reverse(number);
        while (reversedNumber != 0) {
            int lastDigit = reversedNumber % 10;
            switch (lastDigit) {
                case 0:
                    System.out.print("Zero ");
                    wordCount++;
                    break;
                case 1:
                    System.out.print("One ");
                    wordCount++;
                    break;
                case 2:
                    System.out.print("Two ");
                    wordCount++;
                    break;
                case 3:
                    System.out.print("Three ");
                    wordCount++;
                    break;
                case 4:
                    System.out.print("Four ");
                    wordCount++;
                    break;
                case 5:
                    System.out.print("Five ");
                    wordCount++;
                    break;
                case 6:
                    System.out.print("Six ");
                    wordCount++;
                    break;
                case 7:
                    System.out.print("Seven ");
                    wordCount++;
                    break;
                case 8:
                    System.out.print("Eight ");
                    wordCount++;
                    break;
                case 9:
                    System.out.print("Nine ");
                    wordCount++;
                    break;
                default:
                    break;
            }
            reversedNumber /= 10;
        }
        while (wordCount < digitCount) {
            System.out.print("Zero ");
            wordCount++;
        }
        System.out.println(" ");
    }

    public static int reverse(int number) {
        int reversedNumber = 0;
        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }
        return reversedNumber;
    }

    public static int getDigitCount(int number) {
        int length = -1;
        if (number >= 0) {
            length = String.valueOf(number).length();
        }
        return length;
    }
}
