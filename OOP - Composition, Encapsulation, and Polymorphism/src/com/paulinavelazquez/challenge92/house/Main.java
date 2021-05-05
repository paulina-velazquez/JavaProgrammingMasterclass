package com.paulinavelazquez.challenge92.house;

public class Main {

    public static void main(String[] args) {

        Dimensiones deskDimensiones = new Dimensiones(59,30,24);
        Desk theDesk = new Desk("Vivo", "whie",true,  deskDimensiones);
        Lamp theLamp = new Lamp("Lux", "black", 10);
        Dimensiones bookshelfDimensiones = new Dimensiones(50, 50, 20);
        Bookshelf theBookshelf = new Bookshelf("black", bookshelfDimensiones);

        Office theOffice = new Office(theDesk, theLamp, theBookshelf);
        theOffice.walkInToRoom();
        theOffice.raiseDesk(30);
    }
}
