package com.paulinavelazquez.exercise39.polymorphism;


public class Holden extends Car{

    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Holden class - starting engines";
    }

    @Override
    public String accelerate() {
        return "Holden class - accelerating";
    }

    @Override
    public String brake() {
        return "Holden class - braking";
    }
}
