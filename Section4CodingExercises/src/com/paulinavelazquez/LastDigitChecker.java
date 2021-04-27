package com.paulinavelazquez;

public class LastDigitChecker {
    public static void main(String[] args) {
        System.out.println("Testing hasSameLastDigit Method");
        System.out.println(hasSameLastDigit(41,22,71));
        System.out.println(hasSameLastDigit(23,32,42));
        System.out.println(hasSameLastDigit(9,99,999));
        System.out.println(hasSameLastDigit(22,23,34));

        System.out.println("Testing isValid Method");
        System.out.println(isValid(10));
        System.out.println(isValid(468));
        System.out.println(isValid(1051));
    }

    public static boolean hasSameLastDigit(int one, int two, int three) {
        boolean hasSameLastDigit = false;

        if((one < 10) || (one > 1000) || (two< 10) || (two > 1000) || (three < 10) || (three > 1000)) {
            return false;
        }

        int oneLastDigit  = one % 10;
        int twoLastDigit = two % 10;
        int threeLastDigit = three % 10;

        if ((oneLastDigit == twoLastDigit) || (oneLastDigit == threeLastDigit) || (twoLastDigit == threeLastDigit)) {
            hasSameLastDigit = true;
        } else {
            hasSameLastDigit = false;
        }
        return hasSameLastDigit;
    }

    public static boolean isValid(int number) {
        if((number >= 10) && (number <= 1000)) {
            return true;
        } else {
            return false;
        }
    }
}
