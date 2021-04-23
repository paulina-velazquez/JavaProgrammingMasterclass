package com.paulinavelazquez;

public class BarkingDog {
    public static void main(String[] args) {

        System.out.println(shouldWakeUp(true, -1));
    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        boolean haveToWakeUp = false;

        if (hourOfDay < 0 || hourOfDay > 23) {
            haveToWakeUp = false;
        } else if ((barking == true) && (hourOfDay < 8 || hourOfDay > 22)) {
            haveToWakeUp = true;
        } else {
            haveToWakeUp = false;
        }
        return haveToWakeUp;
    }
}
