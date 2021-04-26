package com.paulinavelazquez;

public class Main {

    public static void main(String[] args) {

        System.out.println("For Loop: ");
        int value = 1;

	    if (value == 1) {
            System.out.println("Value was 1");
        } else if (value == 2) {
            System.out.println("Value was 2");
        } else {
            System.out.println("Was not 1 or 2");
        }

        System.out.println("Switch: ");
	    int switchValue = 3;

	    switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2.");
                break;
            case 3: case 4:case 5:
                System.out.println("The value was a 3, a 4, or a 5");
                break;
            default:
                System.out.println("The value was not 1, 2, 3, 4 or 5.");
                break;
        }
    }
}
