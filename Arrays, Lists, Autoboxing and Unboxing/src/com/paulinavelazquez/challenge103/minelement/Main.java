package com.paulinavelazquez.challenge103.minelement;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter count: ");
        int count = scanner.nextInt();
        int[] intArray = readIntegers(count);
        int returnedMin =  findMin(intArray);

        System.out.println("Min = " + returnedMin);
    }

    private static int[] readIntegers(int count) {
        int[] intArray = new int[count];
        for (int i = 0; i < count; i++) {
            System.out.print("Enter a number: ");
            intArray[i] = scanner.nextInt();
        }
        scanner.close();
        return intArray;
    }

    public static int findMin(int[] intArray) {
        int min = 0;
        Arrays.sort(intArray);
        min = intArray[0];
        return min;
    }
}
