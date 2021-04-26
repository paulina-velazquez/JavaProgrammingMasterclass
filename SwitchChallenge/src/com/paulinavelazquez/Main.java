package com.paulinavelazquez;

public class Main {

    public static void main(String[] args) {
        char charValue = 'A';

        switch (charValue) {
            case 1:
                System.out.println("A was found");
                break;
            case 2:
                System.out.println("B was found");
                break;
            case 3:
                System.out.println("C was found");
                break;
            case 4:
                System.out.println("D was found");
                break;
            case 5:
                System.out.println("E was found");
                break;
            default:
                System.out.println("Could not find A, B, C, D, or E.");
        }
    }
}
