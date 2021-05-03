package com.paulinavelazquez.challenge13.vipclient;

public class Main {

    public static void main(String[] args) {

        VipClient defaultClient = new VipClient();
        System.out.println(defaultClient.getClientInfo());

        VipClient clientWithTwoParameters = new VipClient("Olivia Taylor", 5000);
        System.out.println(clientWithTwoParameters.getClientInfo());

        VipClient clientWithThreeParameters = new VipClient("Samuel Taylor", 5000,
                "sam@domain.com");
        System.out.println(clientWithThreeParameters.getClientInfo());
    }
}
