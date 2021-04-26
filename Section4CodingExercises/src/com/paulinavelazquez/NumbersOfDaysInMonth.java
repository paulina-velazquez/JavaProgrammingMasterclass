package com.paulinavelazquez;

public class NumbersOfDaysInMonth {
    public static void main(String[] args) {

        System.out.println(getDaysInMonth(1,2020)); // should return 31 since January has 31 days.
        System.out.println(getDaysInMonth(2,2020)); // should return 29 since February has 29 days in a leap year
        // and 2020 is a leap year.
        System.out.println(getDaysInMonth(2,2018)); // should return 28 since February has 28 days if it's not
        // a leap year and 2018 is not a leap year.
        System.out.println(getDaysInMonth(-1, 2020)); // should return -1 since the parameter month is invalid
        System.out.println(getDaysInMonth(1, -2020)); // should return -1 since the parameter year is outside
        // the range of 1 to 9999.
    }

    public static int getDaysInMonth(int month, int year) {
        int result = 0;

        if ((month < 1) || (month > 12) || (year < 1) || !(year <= 9999)){
            result = -1;
        } else {
            switch (month) {
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    result = 31;
                    break;
                case 4: case 6: case 9: case 11:
                    result = 30;
                    break;
                case 2:
                    boolean isLeap = isLeapYear(year);
                    if (isLeap == true) {
                        result = 29;
                    } else {
                        result = 28;
                    }
            }
        }
        return result;
    }

    public static boolean isLeapYear(int year) {
        boolean isLeap = false;

        if ((year <= 0) || (year >= 10000)) {
            isLeap = false;
        } else {

        // if the year is divided by 4
        if (year % 4 == 0) {

            // if the year is century
            if (year % 100 == 0) {

                // if year is divided by 400
                // then it is a isLeap year
                if (year % 400 == 0) {
                    isLeap = true;
                } else {
                    isLeap = false;
                }
                // if the year is not century
            } else {
                isLeap = true;
            }
        } else {
            isLeap = false;
        }
    }
        return isLeap;
    }
}

