package com.paulinavelazquez.section4;


public class SpeedConverter {
    public static void main(String[] args) {
        printConversion(10.5);
    }

    public static long toMilesPerHour(double kilometersPerHour) {
        long result = 0;
        if (kilometersPerHour < 0) {
            result = -1;
        } else {
            double miles = kilometersPerHour / 1.609;
            long roundedMiles = Math.round(miles);
            result = roundedMiles;
        }
        return result;
    }

    public static void printConversion(double kilometersPerHour) {

        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value.");
        } else {
            long miles = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + " km/h = " + miles + " mi/h.");
        }
    }
}

