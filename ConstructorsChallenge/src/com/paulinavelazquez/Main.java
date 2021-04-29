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

        BankAccount pausBankAccount = new BankAccount("12345", 0.00,
                "Paulina V.", "myemail@domain.com", "(305) 212-8819");

        System.out.println("Bank account number: " + pausBankAccount.getAccountNumber());
        System.out.println("Customer's name: " + pausBankAccount.getCustomerName());
        System.out.println("Customer's email: " + pausBankAccount.getEmail());
        System.out.println("Customer's phone number: " + pausBankAccount.getPhoneNumber());
        System.out.println("Bank account balance $" + pausBankAccount.getBalance());
        System.out.println(" ");
        pausBankAccount.depositFunds(50);
        pausBankAccount.withdrawal(10);

        BankAccount emptyAccount = new BankAccount();

        System.out.println("Bank account number: " + emptyAccount.getAccountNumber());
        System.out.println("Customer's name: " + emptyAccount.getCustomerName());
        System.out.println("Customer's email: " + emptyAccount.getEmail());
        System.out.println("Customer's phone number: " + emptyAccount.getPhoneNumber());
        System.out.println("Bank account balance $" + emptyAccount.getBalance());

        BankAccount allisonsAccount = new BankAccount("Allison", "allison@domain", "12345");
        System.out.println(allisonsAccount.getAccountNumber() + " name " + allisonsAccount.getCustomerName());


        System.out.println("\nVipCustomer Class");
        VipCustomer person1 = new VipCustomer();
        System.out.println(person1.getName());

        VipCustomer person2 = new VipCustomer("Mary", 25000.00);
        System.out.println(person2.getName());

        VipCustomer person3 = new VipCustomer("Miranda", 1000.00, "miranda@domain.com");
        System.out.println(person3.getName());
        System.out.println(person3.getEmail());

    }
}



























