package com.paulinavelazquez;

public class DecimalComparator {
    public static void main(String[] args) {

        System.out.println(equalByThreeDecimalPlaces(-3.1756, -3.175));
    }

    public static boolean equalByThreeDecimalPlaces(double firstNumber, double secondNumber) {
        boolean isEqual = false;
        int firstNumberInt = (int) (firstNumber * 1000);
        int secondNumberInt = (int) (secondNumber * 1000);

        if (firstNumberInt == secondNumberInt) {
            isEqual = true;
        } else {
            isEqual = false;
        }
        return isEqual;
    }
}
