package personal;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CRMSystem {
    private List<Contact> contacts;
    private static final String FILE_PATH = "contacts.txt";

    public CRMSystem() {
        contacts = new ArrayList<>();
        loadContactsFromFile(FILE_PATH);
    }

    private void loadContactsFromFile(String filename) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 5) {
                    String name = parts[0].trim();
                    String email = parts[1].trim();
                    String phoneNumber = parts[2].trim();
                    boolean membership = Boolean.parseBoolean(parts[3].trim());
                    int orderQuantity = Integer.parseInt(parts[4].trim());
                    contacts.add(new Contact(name, email, phoneNumber, membership, orderQuantity));
                } else {
                    System.err.println("Invalid data format in contacts.txt: " + line);
                }
            }
            System.out.println("Contacts loaded from contacts.txt");
        } catch (IOException e) {
            System.err.println("Error reading contacts.txt: " + e.getMessage());
        }
    }

    private void saveContactsToFile(String filename) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (Contact contact : contacts) {
                writer.write(contact.getName() + "," + contact.getEmail() + "," + contact.getPhoneNumber() + "," + contact.isMembership() + "," + contact.getOrderQuantity());
                writer.newLine();
            }
            System.out.println("Contacts saved to contacts.txt");
        } catch (IOException e) {
            System.err.println("Error writing contacts to contacts.txt: " + e.getMessage());
        }
    }

    public void addContact(Contact contact) {
        contacts.add(contact);
        saveContactsToFile(FILE_PATH);
        System.out.println("Contact successfully added.");
    }

    public void removeContact(String name) {
        if (name.equalsIgnoreCase("all")) {
            contacts.clear();
            saveContactsToFile(FILE_PATH);
            System.out.println("All contacts have been successfully deleted.");
        } else {
            Contact contactToRemove = null;
            for (Contact contact : contacts) {
                if (contact.getName().equalsIgnoreCase(name)) {
                    contactToRemove = contact;
                    break;
                }
            }
            if (contactToRemove != null) {
                contacts.remove(contactToRemove);
                saveContactsToFile(FILE_PATH);
                System.out.println("The contact has been successfully deleted.");
            } else {
                System.out.println("No contact found with the specified name.");
            }
        }
    }

    public void viewAllContacts() {
        if (contacts.isEmpty()) {
            System.out.println("No contacts available.");
        } else {
            for (Contact contact : contacts) {
                System.out.println(contact);
            }
        }
    }

    public void findContact(String searchTerm) {
        boolean contactFound = false;
        for (Contact contact : contacts) {
            if (contact.getName().equalsIgnoreCase(searchTerm) || contact.getEmail().equalsIgnoreCase(searchTerm) || contact.getPhoneNumber().equalsIgnoreCase(searchTerm)) {
                System.out.println("Contact found: " + contact);
                contactFound = true;
                break;
            }
        }
        if (!contactFound) {
            System.out.println("Contact not found.");
        }
    }
}
