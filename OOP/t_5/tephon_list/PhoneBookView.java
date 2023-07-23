package OOP.t_5.tephon_list;

import java.util.List;
import java.util.Scanner;

public class PhoneBookView {
    public void displayMenu() {
        System.out.println("Phone Book Menu");
        System.out.println("1. Add Contact");
        System.out.println("2. Remove Contact");
        System.out.println("3. Export Contacts");
        System.out.println("4. Import Contacts");
        System.out.println("0. Exit");
        System.out.print("Enter your choice: ");
    }

    public Contact getContactDetailsFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter contact name: ");
        String name = scanner.nextLine();
        System.out.print("Enter contact phone number: ");
        String phoneNumber = scanner.nextLine();
        return new Contact(name, phoneNumber);
    }

    public void displayContacts(List<Contact> contacts) {
        System.out.println("Contacts:");
        for (Contact contact : contacts) {
            System.out.println(contact.getName() + " - " + contact.getPhoneNumber());
        }
    }

    public String getExportFilePathFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter export file path: ");
        return scanner.nextLine();
    }

    public String getImportFilePathFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter import file path: ");
        return scanner.nextLine();
    }
}
