package OOP.t_5.tephon_list;

import java.util.ArrayList;
import java.util.List;

public class PhoneBookModel {
    private List<Contact> contacts;

    public PhoneBookModel() {
        contacts = new ArrayList<>();
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    public void removeContact(Contact contact) {
        contacts.remove(contact);
    }
}
