package com.paulinavelazquez.challenge108.arraylist;

import java.util.Scanner;

public class PersistenceService {

    private Scanner scanner = new Scanner(System.in);
    private ArrayListRepository arrayListRepository = new ArrayListRepository(this);

    public void runApp() {

        startPhone();
        boolean quit = false;
        while (!quit) {
            System.out.print("\nEnter action: ");
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    System.out.println("Shutting down...");
                    quit = true;
                    break;
                case 1:
                    printContacts();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    queryContact();
                    break;
                case 6:
                    printActions();
                    break;
            }
        }
    }

    private static void startPhone() {
        System.out.println("Starting phone...");
        printActions();
    }

    private void printContacts() {
        arrayListRepository.printAllContacts();
    }

    public void addNewContact() {
        System.out.print("Enter new contact name: ");
        String name = scanner.nextLine();
        System.out.print("Enter phone number: ");
        String phoneNumber = scanner.nextLine();
        ContactDTO newContact = ContactDTO.createNewContact(name, phoneNumber);
        arrayListRepository.saveNewContact(newContact);
    }

    private void updateContact() {
        System.out.print("Enter existing contact name: ");
        String name = scanner.nextLine();
        ContactDTO existingContactDTORecord = arrayListRepository.queryContact(name);
        if (isContactNull(existingContactDTORecord)) {
            System.out.println("Contact not found");
        } else {
            updatingContact(existingContactDTORecord);
        }
    }

    private boolean isContactNull(ContactDTO contactDTO) {
        if (contactDTO == null) {
            return true;
        } else {
            return false;
        }
    }

    public void updatingContact(ContactDTO existingContactDTO) {
        System.out.println("test 8");
        System.out.print("Enter new contact name: ");
        String newName = scanner.nextLine();
        System.out.print("Enter new contact phone number: ");
        String newNumber = scanner.nextLine();
        ContactDTO newContactDTO = ContactDTO.createNewContact(newName, newNumber);
        arrayListRepository.updateContact(existingContactDTO, newContactDTO);
    }

    private void removeContact() {
        System.out.print("Enter existing contact name: ");
        String name = scanner.nextLine();
        ContactDTO existingContactDTORecord = arrayListRepository.queryContact(name);
        arrayListRepository.removingContactChecker(existingContactDTORecord);
    }

    private void queryContact() {
        System.out.print("Enter contact name: ");
        String name = scanner.nextLine();
        ContactDTO existingContactDTORecord = arrayListRepository.queryContact(name);
        arrayListRepository.queryingContact(existingContactDTORecord);
    }

    private static void printActions() {
        System.out.println("\nAvailable:");
        System.out.println("\t 0 - To shutdown.");
        System.out.println("\t 1 - To print contacts.");
        System.out.println("\t 2 - To add a new contact.");
        System.out.println("\t 3 - To update existing an existing contact");
        System.out.println("\t 4 - To remove an exiting contact.");
        System.out.println("\t 5 - To query if an existing contact exists.");
        System.out.println("\t 6 - To print a list of available actions.");
    }
}
