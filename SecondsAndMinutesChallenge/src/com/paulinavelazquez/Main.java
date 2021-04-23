package com.paulinavelazquez;

public class Main {
    public static void main(String[] args) {

        System.out.println(getDurationString(65, 45));
        getDurationString(3945L);
    }

    public static String getDurationString(long minutes, long seconds) {
        String message = "";
        if ((minutes < 0) || (seconds < 0) || (seconds > 60)) {
            message = "Invalid value";
        }

        long hours = minutes / 60;
        long remainingMinutes = minutes % 60;
        message = hours + "h " + remainingMinutes + "m " + seconds + "s.";

        return message;
    }

    public static String getDurationString(long seconds) {
        String message = "";

        if (seconds < 0) {
            message = "Invalid value";
        }

        long minutes = seconds / 60;
        long remainingSeconds = seconds % 60;
        return getDurationString(minutes, remainingSeconds);
    }
}
