package com.paulinavelazquez;

public class SharedDigit {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(15, 55));
    }

    public static boolean hasSharedDigit(int firstDigit, int secondDigit) {
        boolean hasDigit = false;
        if ((firstDigit < 10) || (firstDigit > 99) || (secondDigit < 10) || (secondDigit > 99)) {
            return false;
        }

        if ((firstDigit / 10) == (secondDigit / 10) || (firstDigit / 10) == (secondDigit % 10) ||
                (firstDigit % 10) == (secondDigit / 10) || (firstDigit % 10) == (secondDigit % 10)) {
            hasDigit = true;
        }
        return hasDigit;
    }
}
