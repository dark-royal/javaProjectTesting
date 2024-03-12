package objectOrientedProgramming3;

import javax.swing.*;

public class MainApplication {

    private  Diary diary;
//    String username = input("Enter username");
//    String password = input("Enter password");
//
//    public void initializer(){
//        diary = new Diary(username,password);
//    }



    public static void main(String[] args) {

        MainApplication mainApplication = new MainApplication();
        mainApplication.initializeDiary();

        mainApplication.mainMenu();
    }


    public static String input(String prompt){
        return JOptionPane.showInputDialog(null,prompt);
    }

    public static void print(String output){
        JOptionPane.showMessageDialog(null,output );
    }

    public  void mainMenu() {
        String returnValue = input(String.format("""
                Welcome to %s Diary
                <><><><><><><><><><><><><><><><><>
                What will you like to do
                \t\t\tEnter 1: lock diary
                \t\t\tEnter 2: unlock diary
                \t\t\tEnter 3: create entry
                \t\t\tEnter 4: find entry by id
                \t\t\tEnter 5: update entry
                \t\t\tEnter 6: delete entry
                \t\t\tEnter 7: exit diary
                <><><><><><><><><><><><><><><><><>""",diary.getUserName()));
        option(returnValue);
    }


    public  void option(String option) {

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
        print("<><><>Diary unlocked successfully");
        mainMenu();
    }
    public void initializeDiary(){
        String username = input("Enter your preferred username");
        String password = input("Enter your preferred password");
        diary = new Diary(username, password);
    }

    public   void createDiary(){
        String title = input("Enter title ");
        String body = input("Enter body");
        diary.createEntry(title,body);
        print("<><><<><><><>Entry created successfully");
        print(title + "\n" + body);
        print("your entry id is" + diary.generateId());
        mainMenu();
    }

    public  void findEntryById(){

        try {
            String id = input("Enter id");
            diary.findEntryById(Integer.parseInt(id));
            print(id + " is found");
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
            print(id + "\n" + newTitle + "\n" + newBody);


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
            print(id + " is deleted successfully");
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
        print("Thanks for using  Dark Royal diary");
    }

    public  void lockDiary(){
        diary.lockDiary();
        print("diary locked successfully");
        mainMenu();
    }



}
