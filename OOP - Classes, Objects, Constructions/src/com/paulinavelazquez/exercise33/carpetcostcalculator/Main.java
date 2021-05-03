package com.paulinavelazquez.exercise33.carpetcostcalculator;

public class Main {

    public static void main(String[] args) {

        com.paulinavelazquez.carpetcostcalculator.Carpet carpet = new com.paulinavelazquez.carpetcostcalculator.Carpet(3.5);
        Floor floor = new Floor(2.75, 4.0);
        com.paulinavelazquez.carpetcostcalculator.Calculator calculator = new com.paulinavelazquez.carpetcostcalculator.Calculator(floor, carpet);
        System.out.println("total = " + calculator.getTotalCost());

        carpet = new com.paulinavelazquez.carpetcostcalculator.Carpet(1.5);
        floor = new Floor(5.4, 4.5);
        calculator = new com.paulinavelazquez.carpetcostcalculator.Calculator(floor, carpet);
        System.out.println("total = " + calculator.getTotalCost());
    }
}
