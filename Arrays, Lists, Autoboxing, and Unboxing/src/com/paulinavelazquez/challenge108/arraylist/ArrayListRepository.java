package com.paulinavelazquez.challenge108.arraylist;

import java.util.ArrayList;

public class ArrayListRepository {

    private ArrayList<ContactDTO> myContact;
    private PersistenceService persistenceService;

    public ArrayListRepository(PersistenceService persistenceService) {
        this.myContact = new ArrayList<ContactDTO>();
        this.persistenceService = persistenceService;
    }

    public void saveNewContact(ContactDTO contactDTO) {
        if (findContact(contactDTO.getName()) >= 0) {
            System.out.println("Contact " + contactDTO.getName() + " already on file.");
        } else {
            myContact.add(contactDTO);
            System.out.println("Your contact " + contactDTO.getName() + ", " + contactDTO.getPhoneNumber() + " was successfully saved.");
        }
    }

    public void updateContact(ContactDTO existingContactDTO, ContactDTO newContactDTO) {
        int foundPosition = findContact(existingContactDTO);

        if (foundPosition < 0) {
            System.out.println(existingContactDTO.getName() + " was not found.");
        } else if (findContact(newContactDTO.getName()) != -1) {
            System.out.println("Contact with name " + newContactDTO.getName() +
                    " already exists. Updated was not successful.");
        }

        myContact.set(foundPosition, newContactDTO);
        System.out.println(existingContactDTO.getName() + ", was replaced with " + newContactDTO.getName());
        System.out.println("Successfully upgraded record");
    }

    public void removingContactChecker(ContactDTO contactDTO) {
        if (contactDTO == null) {
            System.out.println("Contact was not found");
        } else {
            removeContact(contactDTO);
        }
    }

    private void removeContact(ContactDTO contactDTO) {
        int foundPosition = findContact(contactDTO);
        if (foundPosition < 0) {
            System.out.println(contactDTO.getName() + " was not found");
        } else {
            myContact.remove(foundPosition);
            System.out.println(contactDTO.getName() + " was deleted");
        }
    }

    private int findContact(ContactDTO contactDTO) {
        return this.myContact.indexOf(contactDTO);
    }

    private int findContact(String contactName) {
        for (int i = 0; i < myContact.size(); i++) {
            ContactDTO contactDTO = this.myContact.get(i);
            if (contactDTO.getName().equals(contactName)) {
                return i;
            }
        }
        return -1;
    }

    public String queryContact(ContactDTO contactDTO) {
        if (findContact(contactDTO) >= 0) {
            return contactDTO.getName();
        }
        return null;
    }

    public ContactDTO queryContact(String name) {
        int position = findContact(name);
        if (position >= 0) {
            return this.myContact.get(position);
        }
        return null;
    }

    public void queryingContact(ContactDTO contactDTO) {
        if (contactDTO == null) {
            System.out.println("Contact not found");
        } else {
            System.out.println("Name: " + contactDTO.getName() +
                    " phone number: " + contactDTO.getPhoneNumber());
        }
    }

    public void printAllContacts() { // GOOD
        System.out.println("You have " + myContact.size() + " contacts.");
        for (int i = 0; i < myContact.size(); i++) {
            System.out.println((i + 1) + ". name:  " +
                    this.myContact.get(i).getName() + " phone number: " +
                    this.myContact.get(i).getPhoneNumber());
        }
    }
}
