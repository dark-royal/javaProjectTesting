

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;



public class PhoneBook {

    public static Map<String, String> phoneBook = new HashMap<>();
    private static final ArrayList<String> address = new ArrayList<>();

    public static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        display();
        display1();

    }

    public static  void display() {
        System.out.println("WELCOME TO PHONEBOOK");
    }

    public static void display1() {
        System.out.println("Main menu \n" +
                "\t\t\tEnter 1 -> Collect contact and store\n" +
                "\t\t\tEnter 2 -> Search for contact \n" +
                "\t\t\tEnter 3 - >Display contact\n" +
                "\t\t\tEntre 4 -> Delete contact\n" +
                "\t\t\tEnter 0 -> Exit ");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

        System.out.println("Enter option");
        int option = input.nextInt();
        switch (option) {
            case 1:
                collectContact();
                break;
            case 2:
                searchForContacts();
                break;
            case 3:
                displayContacts();
                break;

            case 4:
                deleteNumber();
                break;

            case 0:
                System.exit(404);
                break;
            default:
                System.out.println("Enter valid option");
                display1();
        }
    }

    public static  void collectContact() {
        System.out.println("Add phone number");
        String phoneNumber = input.next();



        System.out.println("Enter full name");
        String fullName = input.next();
        phoneBook.put(fullName, phoneNumber);

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Saved Successfully");
        display1();

    }

    public static  void collectAddress() {

        System.out.println("Enter the address");
        String address = input.next();
        System.out.println("LOADING.......SAVED SUCCESSFULLY");
    }

    public static void searchForContacts() {
        System.out.println("Enter name to search");
        String name = input.next();
        String phoneNumber = phoneBook.get(name);

        if (phoneNumber != null) {
            System.out.println("Search result: ");
            System.out.println( name + "-" + phoneNumber);
            display1();
        }
        else {
            System.out.println("no information found for" + name);
            display1();
        }
    }


        private static void displayContacts() {
            System.out.println("All Contacts:");
            for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
                System.out.println(entry.getKey() + " - " + entry.getValue());
            }
            display1();
    }
    public static void deleteNumber(){
        System.out.println("Enter name you want to delete");
        String  deleteName = input.next();
        String deleteContact = phoneBook.remove(deleteName);

        if (deleteContact != null) {
            System.out.println("Contact deleted");
        }
        else{
            System.out.println("no contact found");

        }
        display1();

    }

}








