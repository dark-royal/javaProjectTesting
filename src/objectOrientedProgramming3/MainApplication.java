package objectOrientedProgramming3;

import javax.swing.*;

public class MainApplication {

    private static final Diary diary = new Diary("userName","password");

    public static void main(String[] args) {
        mainMenu();
    }
    public static String input(String prompt){
        return JOptionPane.showInputDialog(prompt);
    }

    public static void print(String output){
        JOptionPane.showMessageDialog(null,"output" );
    }

    public static void mainMenu() {
        System.out.println("Welcome to Dark Royal Diary");
        System.out.println("<><><><><><><><><><><><><><><><><>");
        System.out.println("What will you like to do\n" +
                "\t\t\tEnter 1: unlock diary\n" +
                "\t\t\tEnter 2: lock diary\n" +
                "\t\t\tEnter 3: create entry\n" +
                "\t\t\tEnter 4: find entry by id\n"+
                "\t\t\tEnter 5: update entry\n" +
                "\t\t\tEnter 6: delete entry\n" +
                "\t\t\tEnter 7: exit diary");
        System.out.println("<><><><><><><><><><><><><><><><><>");
        option();

    }

    public static void option() {
        String option = input("Enter option to choose from");
        switch (option.charAt(0)){
            case '1'-> lockDiary();

            case '2'-> unlockDiary();

            case '3'-> createDiary();

            case '4'-> findEntryById();

            case '5'-> updateEntry();

            case '6'-> deleteEntry();

            case '7'-> exitDiary();
        }



    }

    public static void unlockDiary(){
        String password = input("Enter password to unlock");
        diary.unlock(password);
        System.out.println("<><><>Diary unlocked successfully");
        mainMenu();
    }

    public static  void createDiary(){
        String title = input("Enter title ");
        String body = input("Enter body");
        diary.createEntry(title,body);
        System.out.println("<><><<><><><>Entry created successfully");
        mainMenu();
    }

    public static void findEntryById(){

        try {
            String id = input("Enter id");
            diary.findEntryById(Integer.parseInt(id));
            System.out.println(id + " is found");
        }catch (Exception e){
            print(e.getMessage());
            print("id not found");
        }

        finally {
            mainMenu();
        }
    }

    public static  void updateEntry() {
        try {
            String id = input("Enter the id");
            String newTitle = input("Enter new title");
            String newBody = input("Enter new body");
            diary.updateEntry(Integer.parseInt(id), newTitle, newBody);
            System.out.println(id + "\n" + newTitle + "\n" + newBody);


        } catch (Exception e) {
            print(e.getMessage());
            print("id not found");
        } finally {
            mainMenu();
        }
    }



    public static void deleteEntry() {
        try {
            String id = input("Enter id to delete");
            diary.deleteEntry(Integer.parseInt(id));
            System.out.println(id + " is deleted successfully");
        } catch (Exception e) {
            print(e.getMessage());
            print("id not found");
        }
        finally {
            mainMenu();
        }
    }

    public static void exitDiary(){
        System.exit(404);
    }

    public static void lockDiary(){
        diary.lockDiary();
        System.out.println("diary locked successfully");
        mainMenu();
    }



}
