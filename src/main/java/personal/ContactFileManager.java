package personal;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class ContactFileManager {
    private static final String FILE_PATH = "contacts.txt";

    public static void saveContacts(List<Contact> contacts) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH))) {
            for (Contact contact : contacts) {
                String line = contact.getName() + "," + contact.getEmail() + "," + contact.getPhoneNumber() + "," + contact.isMembership() + "," + contact.getOrderQuantity();
                writer.write(line);
                writer.newLine();
            }
            System.out.println("Contacts saved to contacts.txt");
        } catch (IOException e) {
            System.out.println("Error occurred while saving contacts.");
            e.printStackTrace();
        }
    }
}
