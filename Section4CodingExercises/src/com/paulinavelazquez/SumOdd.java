package com.paulinavelazquez;

public class SumOdd {
    public static void main(String[] args) {
        System.out.println(sumOdd(1,100));
        System.out.println(sumOdd(-1, 100));
        System.out.println(sumOdd(100, 100));
        System.out.println(sumOdd(13, 13));
        System.out.println(sumOdd(100, -100));
        System.out.println(sumOdd(100, 1000));
        System.out.println(sumOdd(10, 5));
        System.out.println(sumOdd(1, 11));
    }

    public static int sumOdd(int start, int end) {
        int sum = 0;

        if (!(end >= start) || !(start > 0) || !(end > 0)) {
            sum = -1;
        } else {
            for (int i = start; i <= end; i++) {
                if (isOdd(i)) {
                    sum = sum + i;
                }
            }
        }
        return sum;
    }

    public static boolean isOdd(int number) {
        boolean isOdd = false;

        if (number < 0) {
            isOdd = false;
        } else if (!(number % 2 == 0)) {
            isOdd = true;
        } else {
            isOdd = false;
        }
        return isOdd;
    }
}
