package com.paulinavelazquez.wallarea;

public class Wall {

    private double width;
    private double height;

    public Wall() {
        System.out.println("No argument constructor");
    }

    public Wall(double width, double height) {
        System.out.println("Parameterized constructor");
        this.width = width;
        this.height = height;
        if (width < 0) {
            setWidth(width);
        }
        if (height < 0) {
            setHeight(height);
        }
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }
    }

    public void setHeight(double height) {
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    public double getArea() {
        return this.height * this.width;
    }
}
