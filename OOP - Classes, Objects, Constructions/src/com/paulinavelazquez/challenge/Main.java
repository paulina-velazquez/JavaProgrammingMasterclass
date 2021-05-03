package com.paulinavelazquez.challenge;

public class Main {

    public static void main(String[] args) {
        BankAccount emmaAccount = new BankAccount();

        emmaAccount.setAccountNumber(12345);
        emmaAccount.setBalance(500);
        emmaAccount.setCustomerName("Emma Watson");
        emmaAccount.setEmail("emmaw@domain.com");
        emmaAccount.setPhoneNumber("(305) 121-4420");

        BankAccount mikeAccount = new BankAccount(157, 400,
                "Mike Smith", "mike@domain.com", "3051118810");

        System.out.println(emmaAccount.getCustomerInfo());
        System.out.println(mikeAccount.getCustomerInfo());

        emmaAccount.makeDeposit(500);
        mikeAccount.makeDeposit(300);

        emmaAccount.makeDeposit(-50);

        emmaAccount.withdrawal(100);
        mikeAccount.withdrawal(200);

        System.out.println(emmaAccount.getCustomerInfo());
        System.out.println(mikeAccount.getCustomerInfo());
    }
}
