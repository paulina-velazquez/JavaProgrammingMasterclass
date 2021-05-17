package com.paulinavelazquez;

import static org.junit.Assert.*;

public class BankAccountTest {

    private BankAccount account;
    private static int count; // Make this static to have only one instance

    @org.junit.BeforeClass
    public static void beforeClass() {
        System.out.println("This executes before any test case. Count = " + count++);
    }

    @org.junit.Before
    public void setup() {
        account = new BankAccount("Veronica", "Jolla", 1000.00, BankAccount.CHECKING);
        System.out.println("Running a test...");
    }

    @org.junit.Test
    public void deposit() throws Exception{
        double balance = account.deposit(200.00, true);
        assertEquals(1200.00, balance, 0);
    }

    @org.junit.Test
    public void withdrawBranch() throws Exception{
        double balance = account.withdraw(600.00, true);
        assertEquals(400.00, balance, 0);
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void withdrawNotBranch() throws Exception{
        account.withdraw(600.00, false);
        fail("Should have thrown an IllegalArgumentException");
    }

    // When expecting exceptions in previous versions of JUnit 4
//    @org.junit.Test
//    public void withdrawNotBranch() throws Exception{
//        try {
//            account.withdraw(600.00, false);
//            fail("Should have thrown an IllegalArgumentException");
//        } catch (IllegalArgumentException e) {
//
//        }
//    }

    @org.junit.Test
    public void getBalanceDeposit() throws Exception{
        account.deposit(200.00, true);
        assertEquals(1200.00, account.getBalance(), 0);
    }

    @org.junit.Test
    public void getBalanceWithdraw() throws Exception{
        account.withdraw(200.00, true);
        assertEquals(800.00, account.getBalance(), 0);
    }

    @org.junit.Test
    public void isCheckingTrue() throws Exception{
        assertTrue("The account is not a checking account", account.isChecking());
    }

    @org.junit.AfterClass
    public static void afterClass() throws Exception{
        System.out.println("This executes after any test cases. Count = " + count++);
    }

    @org.junit.After
    public void teardown() throws Exception{
        System.out.println("Count = " + count++);
    }
}