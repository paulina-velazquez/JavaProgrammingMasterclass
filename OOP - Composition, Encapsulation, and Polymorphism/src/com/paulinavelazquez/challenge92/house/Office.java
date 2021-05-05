package com.paulinavelazquez.challenge92.house;

public class Office {

    private Desk theDesk;
    private Lamp theLamp;
    private Bookshelf bookshelf;

    public Office(Desk theDesk, Lamp theLamp, Bookshelf bookshelf) {
        this.theDesk = theDesk;
        this.theLamp = theLamp;
        this.bookshelf = bookshelf;
    }

    public void walkInToRoom() {
        System.out.println("Opening the door and walking into office.");
        theLamp.turnOn();
    }

    public void raiseDesk(int height) {
        theDesk.raiseDesk(height);
    }
}
