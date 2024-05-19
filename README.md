# Contact Management System

The Contact Management System is a Java application designed to efficiently manage contacts. It offers functionalities like adding, removing, viewing contacts, finding contacts by name, email, or phone number, and generating **fake contacts** for testing purposes.

## Features

- **View All Contacts:** View all contacts stored in the system.
- **Find Contact:** Search for a contact by name, email, or phone number.
- **Add Contact:** Add a new contact to the system.
- **Remove Contact:** Remove a contact from the system. Option to remove all contacts at once.
- **Generate Fake Contacts:** Add a specified number of randomly generated fake contacts for testing purposes.
- **Data Persistence:** Contacts are saved to a text file (`contacts.txt`) for persistence between program runs.

## Usage

1. **View All Contacts:** Choose option 1 from the menu.
2. **Find Contact:** Choose option 2 from the menu and enter the name, email, or phone number of the contact to search for.
3. **Add Contact:** Choose option 3 from the menu and provide details like name, email, phone number, membership status (true/false), and order quantity.
4. **Remove Contact:** Choose option 4 from the menu and enter the name of the contact to remove. Use 'all' to remove all contacts.
5. **Generate Fake Contacts:** Choose option 5 from the menu and enter the number of fake contacts to generate.
6. **Exit:** Choose option 9 from the menu to exit the program.

## How to Run

1. Clone the repository to your local machine.
2. Open the project in an IDE (Integrated Development Environment) like IntelliJ IDEA or Eclipse.
3. Run the `Main.java` file to start the application.
4. Follow the on-screen instructions to perform various operations on contacts.

## Dependencies

- **Java Faker:** Used to generate fake contact details for testing purposes.

## Notes

- Contact data is stored in a text file named `contacts.txt` for persistence.
- Handle inputs carefully to avoid errors.
- For issues or suggestions, feel free to raise an issue in the repository.

Enjoy managing your contacts with this simple yet efficient Contact Management System!
