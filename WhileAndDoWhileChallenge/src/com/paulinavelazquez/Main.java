package com.paulinavelazquez;

public class Main {

    public static void main(String[] args) {
        int number = 4;
        int finishNumber = 20;
        int evenNumbersFound = 0;

        while ((number <= finishNumber) && !(evenNumbersFound == 5)) {
            number++;
            if(!isEvenNumber(number)) {
                continue;
            }
            System.out.println("Even number: " + number);
            evenNumbersFound++;
        }
        System.out.println("Total even numbers found = " + evenNumbersFound);
    }

    public static boolean isEvenNumber(int number) {
        boolean isEven = false;

        if (number % 2 == 0) {
            isEven = true;
        } else {
            isEven = false;
        }

        return isEven;
    }
}
