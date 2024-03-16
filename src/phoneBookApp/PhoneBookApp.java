package phoneBookApp;

import java.util.ArrayList;
import java.util.List;

public class PhoneBookApp {

    private List<Contact> contacts;

    private boolean isEmpty;

    public PhoneBookApp() {
        contacts = new ArrayList<>();
    }

    public void addContact(String name, String phoneNumber) {
        Contact contact = new Contact(name, phoneNumber);
        contacts.add(contact);

    }

    public int displayContacts() {
        System.out.println("Phone Book:");
        for (Contact contact : contacts) {

        }
        return 0;
    }


    public int getNumberOfContact() {
        return contacts.size();
    }

    public void deleteContact(String name, String phoneNumber) {
        Contact contact1 = new Contact(name, phoneNumber);
        if (phoneBookIsEmpty()) throw new PhoneBookEmptyException("Phonebook is empty");
        else {
            contacts.remove(contact1);
        }
    }

    private boolean phoneBookIsEmpty() {
        isEmpty = true;
        return false;
    }

}


