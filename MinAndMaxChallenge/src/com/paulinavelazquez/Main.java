package com.paulinavelazquez;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int min = 0;
        int max = 0;

        while (true) {
            System.out.print("Enter number: ");
            boolean isAnInt = scanner.hasNextInt();
            if (isAnInt) {
                int userInput = scanner.nextInt();
                if (userInput < max) {
                    min = userInput;
                } else if (userInput >= max) {
                    max = userInput;
                }
            } else {
                System.out.println("Invalid input");
                System.out.println("Min " + min + " Max " + max);
                break;
            }
            scanner.nextLine();
        }
        scanner.close();
    }
}
