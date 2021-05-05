package com.paulinavelazquez.challenge92.house;

public class Desk {

    private String brand;
    private String color;
    private boolean isStandingDesk;
    private Dimensiones dimensiones;

    public Desk(String brand, String color, boolean isStandingDesk, Dimensiones dimensiones) {
        this.brand = brand;
        this.color = color;
        this.isStandingDesk = isStandingDesk;
        this.dimensiones = dimensiones;
    }

    public void raiseDesk(int height) {
        System.out.println("Raising desk to height " + height);
        raisingDeskSound();
    }

    private void raisingDeskSound() {
        System.out.println("pew pew pew");
    }
}
