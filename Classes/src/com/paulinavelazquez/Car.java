package com.paulinavelazquez;

public class Car {

    private int doors;
    private int wheels;
    public String model;
    private String engine;
    private String color;

    public void setModel(String model) {
        String validModel = model.toLowerCase();

        // Validate what was passed equals a carrera or a commodore.
        if (validModel.equals("carrera") || validModel.equals("commodore")) {
            this.model = model;
        } else {
            this.model = "unknown";
        }
    }

    public String getModel() {
        return this.model;
    }
}
