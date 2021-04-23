package com.paulinavelazquez;

public class EqualSumChecker {
    public static void main(String[] args) {

        System.out.println(hasEqualSum(1, -1, 0));
    }

    public static boolean hasEqualSum(int firstNumber, int secondNumber, int thirdNumber) {
        boolean isEqual = false;

        if ((firstNumber + secondNumber) == thirdNumber) {
            isEqual = true;
        } else {
            isEqual = false;
        }
        return isEqual;
    }
}