package com.paulinavelazquez.challenge88;

public class Main {

    public static void main(String[] args) {

        ModelS modelS = new ModelS(36, true);
        modelS.steer(45);
        modelS.accelerate(30);
        modelS.accelerate(20);
        modelS.accelerate(-42);
    }
}
