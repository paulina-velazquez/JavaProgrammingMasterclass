package com.paulinavelazquez.encapsulation.code;

public class Main {

    public static void main(String[] args) {

        Player player = new Player();
        player.name = "Victoria";
        player.health = 20;
        player.weapon = "Sword";

        int damage = 21;
        player.health = 100;
        player.loseHealth(damage);
        System.out.println("Remaining health = " + player.healthRemaining());

        EnhancedPlayer enhancedPlayer = new EnhancedPlayer("Amanda", 200, "Machete");
        System.out.println("Initial health is " + enhancedPlayer.getHitPoints());
    }
}
