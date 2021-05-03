package com.paulinavelazquez.challenge13.vipclient;

public class VipClient {

    private String name;
    private int creditLimit;
    private String emailAddress;

    public VipClient() {
        this("Default name", 2500, "default@domain.com");
    }

    public VipClient(String name, int creditLimit) {
        this (name, creditLimit, "default@domain.com");
    }

    public VipClient(String name, int creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public String getClientInfo() {
        return "Name: " + getName() + ", Credit limit: " + getCreditLimit()
                + ", Email address: " + getEmailAddress();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(int creditLimit) {
        this.creditLimit = creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
}
