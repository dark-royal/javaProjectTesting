package objectOrientedProgramming3;

import javax.swing.*;

public class MainApplication {

    private  final Diary diary = new Diary("userName","password");

    public static void main(String[] args) {
        MainApplication mainApplication = new MainApplication();

        mainApplication.mainMenu();
    }


    public static String input(String prompt){
        return JOptionPane.showInputDialog(prompt);
    }

    public static void print(String output){
        JOptionPane.showMessageDialog(null,"output" );
    }

    public  void mainMenu() {
        System.out.print("""
                Welcome to Dark Royal Diary
                <><><><><><><><><><><><><><><><><>
                What will you like to do
                \t\t\tEnter 1: lock diary
                \t\t\tEnter 2: unlock diary
                \t\t\tEnter 3: create entry
                \t\t\tEnter 4: find entry by id
                \t\t\tEnter 5: update entry
                \t\t\tEnter 6: delete entry
                \t\t\tEnter 7: exit diary
                <><><><><><><><><><><><><><><><><>""");
        option();

    }


    public  void option() {
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

    public  void unlockDiary(){
        String password = input("Enter password to unlock");
        diary.unlock(password);
        System.out.println("<><><>Diary unlocked successfully");
        mainMenu();
    }

    public   void createDiary(){
        String title = input("Enter title ");
        String body = input("Enter body");
        diary.createEntry(title,body);
        System.out.println("<><><<><><><>Entry created successfully");
        System.out.println(title + "\n" + body);
        mainMenu();
    }

    public  void findEntryById(){

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

    public   void updateEntry() {
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



    public  void deleteEntry() {
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

    public  void exitDiary(){
        System.exit(404);
        System.out.println("Thanks for using  Dark Royal diary");
    }

    public  void lockDiary(){
        diary.lockDiary();
        System.out.println("diary locked successfully");
        mainMenu();
    }



}
