package com.paulinavelazquez.challenge88.inheritance;

public class ModelS extends Car{

    private int roadService;
    private boolean onAutoPilot;

    public ModelS(int roadService, boolean onAutoPilot) {
        super("ModelS", "4WD", 4, 4, 0, false);
        this.roadService = roadService;
        this.onAutoPilot = onAutoPilot;
    }

    public void accelerate(int rate) {
        int newVelocity = getCurrentVelocity() + rate;
        if (newVelocity == 0) {
            stop();
        } else if ((newVelocity > 0) && (newVelocity <= 10)) {
            changeGear(1);
        } else if ((newVelocity > 10) && (newVelocity <= 20)) {
            changeGear(2);
        } else if ((newVelocity > 20) && (newVelocity <= 30)) {
            changeGear(3);
        } else {
            changeGear(4);
        }

        if (newVelocity > 0) {
            changeVelocity(newVelocity, getCurrentDirection());
        }
    }
}
