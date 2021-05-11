package com.paulinavelazquez.challenge104.reversearray;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] intArray = {1, 5, 3, 7, 11, 9, 15};
        System.out.println("Non Reversed: " + Arrays.toString(intArray));
        reverse(intArray);
        System.out.println("Reversed: " + Arrays.toString(intArray));

    }

    public static void reverse(int[] array) {
        int maxIndex = array.length - 1;
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex - i] = temp;
        }
    }
}
