package personal;

import java.util.Scanner;

class Logic {
    private CRMSystem crm;

    public Logic(CRMSystem crm) {
        this.crm = crm;
    }

    public void start() {
        while (true) {
            System.out.println("---------------------");
            System.out.println("1. View All Contacts");
            System.out.println("2. Find Contact");
            System.out.println("3. Add Contact");
            System.out.println("4. Remove Contact");
            System.out.println("***");
            System.out.println("5. Add fake contacts");
            System.out.println("***");
            System.out.println("9. Exit");


            /////////////////////
            System.out.print("Enter your choice: ");
            int choice = readIntInput();

            switch (choice) {
                case 3:
                    addContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 1:
                    viewAllContacts();
                    break;
                case 9:
                    System.exit(0);
                    break;
                case 5:
                    addFakeContacts();
                    break;
                case 2:
                    findContact();
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }

    private void addContact() {
        System.out.print("Enter Name: ");
        String name = readStringInput();
        System.out.print("Enter Email: ");
        String email = readStringInput();
        System.out.print("Enter Phone Number: ");
        String phoneNumber = readStringInput();
        System.out.print("Membership (true/false): ");
        boolean membership = Boolean.parseBoolean(readStringInput());
        System.out.print("Order Quantity: ");
        int orderQuantity = readIntInput();
        crm.addContact(new Contact(name, email, phoneNumber, membership, orderQuantity));
    }

    private void removeContact() {
        System.out.print("Enter Name to Remove (or 'all' to remove all contacts): ");
        String nameToRemove = readStringInput();
        crm.removeContact(nameToRemove);
    }

    private void viewAllContacts() {
        crm.viewAllContacts();
    }

    private void addFakeContacts() {
        System.out.print("Enter number of fake contacts to add: ");
        int numFakeContacts = readIntInput();
        Main.generateRandomContacts(crm, numFakeContacts);
    }

    private void findContact() {
        System.out.print("Enter name/email/phone of the contact: ");
        String searchTerm = readStringInput();
        crm.findContact(searchTerm);
    }

    private static int readIntInput() {
        try {
            Scanner scanner = new Scanner(System.in);
            return scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a number.");
            return readIntInput();
        }
    }

    private static String readStringInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
