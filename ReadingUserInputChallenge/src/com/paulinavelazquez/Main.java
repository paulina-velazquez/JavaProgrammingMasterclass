package com.paulinavelazquez;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 1;
        int sum = 0;
        while (counter <= 10) {
            System.out.print("Enter number " + counter + "#: ");
            boolean isAnInt = scanner.hasNextInt();
            if (isAnInt) {
                int userInput = scanner.nextInt();
                sum += userInput;
                counter++;
            } else {
                System.out.println("Invalid number");
            }
            scanner.nextLine(); // handle end of line (enter key)
        }
        System.out.println("Sum = " + sum);
        scanner.close();
    }
}
