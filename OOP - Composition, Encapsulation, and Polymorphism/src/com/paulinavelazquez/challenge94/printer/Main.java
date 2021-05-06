package com.paulinavelazquez.challenge94.printer;

public class Main {

    public static void main(String[] args) {

        Printer printer = new Printer(50,true);
        System.out.println("Initial page count: " + printer.getPagesPrinted());
        int pagesPrinted = printer.printingPage(4);
        System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer = " +
                            printer.getPagesPrinted());
    }
}
