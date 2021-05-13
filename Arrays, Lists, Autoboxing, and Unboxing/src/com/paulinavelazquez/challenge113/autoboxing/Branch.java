package com.paulinavelazquez.challenge113.autoboxing;

import java.util.ArrayList;

public class Branch {

    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean newCustomer(String customerName, double initialAmount) {
        boolean isSaved = false;
            if (findCustomer(customerName) == null) {
                this.customers.add(new Customer(customerName, initialAmount));
                isSaved = true;
            }

        return isSaved;
    }

    public boolean addTransaction(String customerName, double amount) {
        Customer exitingCustomer = findCustomer(customerName);
        if (exitingCustomer != null) {
            exitingCustomer.addTransaction(amount);
            return true;
        }
        return false;
    }

    private Customer findCustomer(String name) {
        for (int i = 0; i < customers.size(); i++) {
            Customer checkedCustomer = this.customers.get(i);
            if (checkedCustomer.getName().equals(name)) {
                return checkedCustomer;
            }
        }
        return null;
    }
}
