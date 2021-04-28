package com.paulinavelazquez;

public class FlourPack {
    public static void main(String[] args) {
        System.out.println(canPackSolution(1,0,4));
        System.out.println(canPackSolution(1,0,5));
        System.out.println(canPackSolution(0,5,4));
        System.out.println(canPackSolution(2,2,11));
        System.out.println(canPackSolution(-3,2,12));
    }

    public static boolean canPackSolution(int bigCount, int smallCount, int goal) {
        boolean result = true;
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            result = false;
        }
        if(goal > ((bigCount * 5) + smallCount)) {
            result = false;
        }

        if((goal % 5) > smallCount) {
            result = false;
        }
        return result;
    }
}
