package phoneBookApp;

import java.util.ArrayList;
import java.util.List;

public class PhoneBookApp {

        private List<Contact> contacts;

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
}


