package com.paulinavelazquez;

public class Main {

    public static void main(String[] args) {

        Telephone pausPhone;

        System.out.println("= Desk Phone =");
        pausPhone = new DeskPhone(12345);
        pausPhone.powerOn();
        pausPhone.callPhone(12345);
        pausPhone.answer();

        System.out.println(" = Mobile Phone =");
        pausPhone = new MobilePhone(24565);
        pausPhone.powerOn();
        pausPhone.callPhone(24565);
        pausPhone.answer();
    }
}
