package com.paulinavelazquez.composition.code;

public class Dimensions {

    private int weight;
    private int height;
    private int depth;

    public Dimensions(int weight, int height, int depth) {
        this.weight = weight;
        this.height = height;
        this.depth = depth;
    }

    public int getWeight() {
        return weight;
    }

    public int getHeight() {
        return height;
    }

    public int getDepth() {
        return depth;
    }
}
