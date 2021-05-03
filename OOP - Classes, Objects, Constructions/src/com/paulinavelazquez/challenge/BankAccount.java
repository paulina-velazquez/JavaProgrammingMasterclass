package com.paulinavelazquez.challenge;


public class BankAccount {

    private long accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount() {
        this(123, 2.50, "Default name",
                "Default address", "Default phone number");
    }

    public BankAccount(long accountNumber, double balance, String customerName,
                       String email, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public BankAccount(String customerName, String email, String phoneNumber) {
        this(9999, 100.55, customerName, email, phoneNumber);
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void makeDeposit(int depositAmount) {
        if (depositAmount > 0 ) {
            this.balance += depositAmount;
            System.out.println("Deposit of $" + depositAmount + " made. New balance is $" + this.balance);
        } else {
            System.out.println("Deposit not processed. Balance is $" + this.balance);
        }

    }

    public void withdrawal(int withdrawalAmount) {
        if (this.balance - withdrawalAmount < 0) {
            System.out.println("Withdrawal not processed. Balance is " + this.balance);
        } else {
            this.balance -= withdrawalAmount;
            System.out.println("Withdrawal of $" + withdrawalAmount + " processed. Remaining balance $" +
                    this.balance);
        }
    }

    public String getCustomerInfo() {
        return "Account number = " + this.accountNumber + ", Customer name = " +
                customerName + ", Balance = " + this.balance;
    }
}

