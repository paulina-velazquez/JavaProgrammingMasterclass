package com.paulinavelazquez.challenge113.autoboxing;

public class Main {

    public static void main(String[] args) {

        Bank bank = new Bank("National Australian Bank");

        if (bank.addBranch("Adelaide")) {
            System.out.println("Adelaide branch created");
        }

        bank.addCustomer("Adelaide", "Veronica", 50.05);
        bank.addCustomer("Adelaide", "Paul", 175.34);
        bank.addCustomer("Adelaide", "Percy", 220.12);

        bank.addBranch("Sydney");
        bank.addCustomer("Sydney", "Bob", 150.54);

        bank.addTransaction("Adelaide", "Veronica", 44.22);
        bank.addTransaction("Adelaide", "Paul", 12.44);
        bank.addTransaction("Adelaide", "Percy", 1.65);

        bank.listCustomers("Adelaide", true);
        bank.listCustomers("Sydney", true);

        bank.addBranch("Melbourne");
        System.out.println(" ");

        if (!bank.addTransaction("Melbourne", "Brian", 52.33)) {
            System.out.println("Error Melbourne branch does not exits");
        }

        if (!bank.addBranch("Adelaide")) {
            System.out.println("Adelaide branch already exists");
        }

        if (!bank.addTransaction("Adelaide", "Fergus", 52.33)) {
            System.out.println("Customer does not exist at branch");
        }
    }
}
