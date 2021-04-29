package com.paulinavelazquez;

public class Main {

    public static void main(String[] args) {
        Car porsche = new Car();
        porsche.setModel("Carrera");
        System.out.println("Model is " + porsche.getModel());

        porsche.setModel("NotModel");
        System.out.println("Model is " + porsche.getModel());
    }
}
