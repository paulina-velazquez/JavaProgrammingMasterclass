package com.paulinavelazquez;

public class Main {

    public static void main(String[] args) {

        int count = 1;

        System.out.println("\n1st While Loop");
        while (count != 6) {
            System.out.println("Count value is " + count);
            count++;
        }

        System.out.println("\nFor Loop");
        for (count = 1; count != 6; count++) {
            System.out.println("Count value is " + count);
        }

        count = 1;
        System.out.println("\n2d While Loop ");
        while (true) {
            if (count == 6) {
                break;
            }
            System.out.println("Count value is " + count);
            count++;
        }

        count = 6;
        System.out.println("\nDo While Loop");
        do {
            System.out.println("Count value was " + count);
            count++;

            if (count > 100) {
                break;
            }
        } while (count != 6);

    }
}
