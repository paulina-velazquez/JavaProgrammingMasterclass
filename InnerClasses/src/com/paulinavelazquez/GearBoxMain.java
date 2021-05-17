package com.paulinavelazquez;

public class GearBoxMain {
    public static void main(String[] args) {

        // Code works with public inner class
//        Gearbox mcLaren = new Gearbox(6);
//        Gearbox.Gear first = mcLaren.new Gear(1, 12.3);
//        Gearbox.Gear second = new Gearbox.Gear(2, 15.4); // Incorrect
//        Gearbox.Gear third = new Gearbox.Gear(3, 17.8); // Incorrect
//        System.out.println(first.driveSpeed(1000));

        // Code works with private inner class
        Gearbox mcLaren = new Gearbox(6);
        mcLaren.operateClutch(true);
        mcLaren.changeGear(1);
        mcLaren.operateClutch(false);
        System.out.println(mcLaren.wheelSpeed(1000));
        mcLaren.changeGear(2);
        System.out.println(mcLaren.wheelSpeed(3000));
        mcLaren.operateClutch(true);
        mcLaren.changeGear(3);
        mcLaren.operateClutch(false);
        System.out.println(mcLaren.wheelSpeed(6000));
    }
}
