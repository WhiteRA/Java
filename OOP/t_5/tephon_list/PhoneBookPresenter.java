package OOP.t_5.tephon_list;

import java.io.*;
import java.util.List;
import java.util.Scanner;

public class PhoneBookPresenter {
    private PhoneBookModel model;
    private PhoneBookView view;

    public PhoneBookPresenter(PhoneBookModel model, PhoneBookView view) {
        this.model = model;
        this.view = view;
    }

    public void handleInput(int choice) {
        switch (choice) {
            case 1:
                Contact contact = view.getContactDetailsFromUser();
                model.addContact(contact);
                break;
            case 2:
                List<Contact> contacts = model.getContacts();
                view.displayContacts(contacts);
                System.out.print("Enter the index of the contact to remove: ");
                Scanner scanner;
                int index = Integer.parseInt(scanner.nextLine());
                if (index >= 0 && index < contacts.size()) {
                    model.removeContact(contacts.get(index));
                } else {
                    view.displayErrorMessage("Invalid contact index.");
                }
                break;
            case 3:
                String exportFilePath = view.getExportFilePathFromUser();
                exportContacts(exportFilePath);
                break;
            case 4:
                String importFilePath = view.getImportFilePathFromUser();
                importContacts(importFilePath);
                break;
            case 0:
                System.out.println("Exiting the phone book...");
                System.exit(0);
                break;
            default:
                view.displayErrorMessage("Invalid choice. Please try again.");
                break;
        }
    }

    private void exportContacts(String filePath) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(filePath))) {
            List<Contact> contacts = model.getContacts();
            for (Contact contact : contacts) {
                writer.println(contact.getName() + "," + contact.getPhoneNumber());
            }
            System.out.println("Contacts exported successfully.");
        } catch (IOException e) {
            view.displayErrorMessage("Error exporting contacts: " + e.getMessage());
        }
    }

    private void importContacts(String filePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 2) {
                    String name = parts[0];
                    String phoneNumber = parts[1];
                    model.addContact(new Contact(name, phoneNumber));
                }
            }
            System.out.println("Contacts imported successfully.");
        } catch (IOException e) {
            view.displayErrorMessage("Error importing contacts: " + e.getMessage());
        }
    }
}
