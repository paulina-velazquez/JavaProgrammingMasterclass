package com.paulinavelazquez;

public class MegaBytesConverter {
    public static void main(String[] args) {

        printMegaBytesAndKilobytes(5000);
    }

    public static void printMegaBytesAndKilobytes(int kiloBytes) {
        if (kiloBytes < 0){
            System.out.println("Invalid Value");
        } else {
            int megaBytes = (kiloBytes / 1024);
            int kiloBytesRemainder = kiloBytes % 1024;
            System.out.println(kiloBytes+" KB = "+megaBytes+" MB and "+kiloBytesRemainder+" KB");
        }
    }
}
