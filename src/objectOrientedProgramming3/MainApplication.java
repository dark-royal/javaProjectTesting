package objectOrientedProgramming3;

import javax.swing.*;

public class MainApplication {

    private  Diary diary;
    private static final Diaries diaries = new Diaries();


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
                     Enter 1: add diary
                    Enter 2: find diary by username
                    Enter 3: delete diary
                    Enter 4: exit diary
                    Enter 5: entry option
                  
                <><><><><><><><><><><><><><><><><>""", diary.getUserName()));
        option(returnValue);
    }
    public String mainMenu1(){
String i ="""
                    Enter 1: lock diary
                    Enter 2: unlock diary
                    Enter 3: create entry
                    Enter 4: find entry by id
                    Enter 5: update entry
                    Enter 6: delete entry
                    Enter 7: exit diary
                    
                """;

        return i;
    }


    public  void option(String option) {
switch (Integer.parseInt(option)){
    case 1:
        addDiary();

       String p =  input(mainMenu1());
       optionMainMenu(p);
        break;
    case 2:
        findDiaryByUsername();
        String pq =  input(mainMenu1());
        optionMainMenu(pq);
        break;


}


    }

    private void findDiaryByUsername() {
        try {
            String username = input("Enter your diary username");
            diaries.findByUserName(username);
            print("diary found successfully");
        } catch (Exception e) {
            print(e.getMessage());
            print("diary not found");
        } finally {
            mainMenu1();
        }
    }

    private void addDiary() {
        try {
            String username = input("Enter your username");
            String password = input("Enter password");
            diaries.addDiary(username, password);
            print("diary is added successfully");

        } catch (Exception e) {
            print(e.getMessage());

        } finally {
            mainMenu1();
        }
    }

    private void optionMainMenu(String option) {
        switch (Integer.parseInt(option)){
            case 1-> lockDiary();

            case 2-> unlockDiary();

            case 3-> createDiary();

            case 4-> findEntryById();

            case 5-> updateEntry();

            case 6-> deleteEntry();

            case 7-> exitDiary();
        }
    }

    public  void unlockDiary(){
        String password = input("Enter password to unlock");
        diary.unlock(password);
        print("<><><>Diary unlocked successfully");
        mainMenu1();
    }
    public void initializeDiary(){
        String username = input("Enter your preferred username");
        String password = input("Enter your preferred password");
        diary = new Diary(username, password);
    }

    public   void createDiary(){
        try {
            String title = input("Enter title ");
            String body = input("Enter body");
            diary.createEntry(title, body);
            print("<><><<><><><>Entry created successfully");
            print(title + "\n" + body);
            print("your entry id is" + diary.generateId());
        }
         catch(Exception e){
            print(e.getMessage());
            print("unlock your diary");
         }
        finally {
            mainMenu1();
        }

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
            mainMenu1();
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
            mainMenu1();
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
            mainMenu1();
        }
    }

    public  void exitDiary(){
        System.exit(404);
        print("Thanks for using  Dark Royal diary");
    }

    public  void lockDiary(){
        diary.lockDiary();
        print("diary locked successfully");
        mainMenu1();
    }



}
