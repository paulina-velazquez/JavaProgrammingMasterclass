package com.paulinavelazquez;

public class Main {

    public static void main(String[] args) {
	    BankAccount bankAccount = new BankAccount();

	    bankAccount.setAccountNumber("123456789");
	    bankAccount.setBalance(500);
	    bankAccount.setCustomerName("Paulina V");
	    bankAccount.setEmail("myemail@domain.com");
	    bankAccount.setPhoneNumber("(305) 121-4420");

        System.out.println("Bank account number: " + bankAccount.getAccountNumber());
        System.out.println("Customer's name: " + bankAccount.getCustomerName());
        System.out.println("Customer's email: " + bankAccount.getEmail());
        System.out.println("Customer's phone number: " + bankAccount.getPhoneNumber());
        System.out.println("Bank account balance $" + bankAccount.getBalance());
        System.out.println(" ");
        bankAccount.depositFunds(50);
        bankAccount.withdrawal(100);
    }
}
