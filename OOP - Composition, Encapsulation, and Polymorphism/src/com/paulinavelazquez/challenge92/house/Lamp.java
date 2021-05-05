package com.paulinavelazquez.challenge92.house;

public class Lamp {

    private String brand;
    private String color;
    private int height;

    public Lamp(String brand, String color, int height) {
        this.brand = brand;
        this.color = color;
        this.height = height;
    }

    public void turnOn() {
        System.out.println("Turning on lamp");
    }
}
