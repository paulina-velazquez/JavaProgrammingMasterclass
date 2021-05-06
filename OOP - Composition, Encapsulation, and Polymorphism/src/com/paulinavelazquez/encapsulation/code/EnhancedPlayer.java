package com.paulinavelazquez.encapsulation.code;

public class EnhancedPlayer {

    private String name;
    private int hitPoints = 100;
    private String weapon;

    public EnhancedPlayer(String name, int hitPoints, String weapon) {
        this.name = name;
        if ((hitPoints > 0) && (hitPoints <= 100)) {
            this.hitPoints = hitPoints;
        }
        this.weapon = weapon;
    }

    public int healthRemaining() {
        return this.hitPoints;
    }

    public int getHitPoints() {
        return hitPoints;
    }
}
