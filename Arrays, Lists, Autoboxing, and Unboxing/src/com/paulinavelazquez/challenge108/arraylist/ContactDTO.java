package com.paulinavelazquez.challenge108.arraylist;

public class ContactDTO {

    private String name;
    private String phoneNumber;

    public ContactDTO(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public static ContactDTO createNewContact(String name, String phoneNumber) {
        return new ContactDTO(name, phoneNumber);
    }
}
