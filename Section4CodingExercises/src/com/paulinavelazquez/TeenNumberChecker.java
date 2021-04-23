package com.paulinavelazquez;

public class TeenNumberChecker {
    public static void main(String[] args) {

        System.out.println(hasTeen(9, 99, 19));
    }

    private static boolean hasTeen(int firstNumber, int secondNumber, int thirdNumber) {
        boolean isTeen = false;

        if ((firstNumber >= 13 && firstNumber <= 19) || (secondNumber >= 13 && secondNumber <= 19) ||
                (thirdNumber >= 13 && thirdNumber <= 19)) {
            isTeen = true;
        } else {
            return false;
        }
        return isTeen;
    }
}