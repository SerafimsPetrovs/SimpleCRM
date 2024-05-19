package personal;

import com.github.javafaker.Faker;

public class Main {
    public static void main(String[] args) {
        CRMSystem crm = new CRMSystem();

        Logic app = new Logic(crm);
        app.start();
    }

    public static void generateRandomContacts(CRMSystem crm, int count) {
        Faker faker = new Faker();
        for (int i = 0; i < count; i++) {
            String name = faker.name().fullName();
            String email = faker.internet().emailAddress();
            String phoneNumber = faker.phoneNumber().phoneNumber();
            int orderQuantity = faker.number().numberBetween(0, 10);
            boolean membership = faker.bool().bool();
            crm.addContact(new Contact(name, email, phoneNumber, membership, orderQuantity));
        }
        System.out.println("Generated " + count + " random contacts.");
    }
}
