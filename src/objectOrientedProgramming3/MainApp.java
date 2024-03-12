package objectOrientedProgramming3;

import javax.swing.*;

public class MainApp {
    private static final Diaries diaries = new Diaries();

    public static void main(String[] args) {
        MainApp mainApp = new MainApp();
        mainApp.mainMenu();

       // mainMenu();
    }
    public static String input(String prompt){
        return JOptionPane.showInputDialog(prompt);
    }

    public static void print(String output){
        JOptionPane.showMessageDialog(null,"output" );
    }

    public void mainMenu(){
        String returnValue = input("""
                Welcome to Diary
                <><><><><><><><><><><><><><><><><>
                What will you like to do
                    Enter 1: add diary
                    Enter 2: find diary by username
                    Enter 3: delete diary
                    Enter 4: exit diary
                <><><><><><><><><><><><><><><><><>""");
        option(returnValue);
    }

    public void option(String option) {
        switch (option.charAt(0)){
            case '1'-> addDiary();
            case '2'-> findDiaryByUsername();
            case '3'-> deleteDiary();
            case '4' -> exitDiaryApp();
            default -> {
                print(" Enter the correct option");
                mainMenu();
            }
        }
}



    public void addDiary() {
        try {
            String username = input("Enter your username");
            String password = input("Enter password");
            diaries.addDiary(username, password);
            print("diary is added successfully");

        } catch (Exception e) {
            print(e.getMessage());

        } finally {
            mainMenu();
        }
    }

    public void findDiaryByUsername() {
        try {
            String username = input("Enter your diary username");
            diaries.findByUserName(username);
            print("diary found successfully");
        } catch (Exception e) {
            print(e.getMessage());
            print("diary not found");
        } finally {
            mainMenu();
        }
    }

    public   void deleteDiary(){
        try {
            String username = input("Enter your diary username");
            String password = input("Enter your diary password");
            diaries.delete(username, password);
            print("diary deleted successfully");

        }catch (Exception e){
            print(e.getMessage());
            print("diary not found");
        }

    }
    public void exitDiaryApp() {
        print("<><><><><>Thanks for using this diary<><><><><>");
        System.exit(404);
    }
}