package objectOrientedProgramming3;

import javax.swing.*;
public class MainApplication {

    private  Diary diary;
    private static final Diaries diaries = new Diaries();


    public static void main(String[] args) {

        MainApplication mainApplication = new MainApplication();

        mainApplication.mainMenu();
    }


    public static String input(String prompt){
        return JOptionPane.showInputDialog(null,prompt);
    }

    public static void print(String output){
        JOptionPane.showMessageDialog(null,output );
    }

    public String mainMenu() {
        String returnValue = input(String.format("""
                Welcome to  Diary
                <><><><><><><><><><><><><><><><><>
                What will you like to do
                     Enter 1: add diary
                    Enter 2: find diary by username
                    Enter 3: delete diary
                    Enter 4: exit diary
                  
                <><><><><><><><><><><><><><><><><>"""));
        option(returnValue);
        return returnValue;
    }
    public String mainMenu1(){
String option ="""
                    Enter 1: lock diary
                    Enter 2: unlock diary
                    Enter 3: create entry
                    Enter 4: find entry by id
                    Enter 5: update entry
                    Enter 6: delete entry
                    Enter 7: exit diary
                """;

        return option;
    }


    public  void option(String option) {
        try {
switch (Integer.parseInt(option)){
    case 1:
        addDiary();

       String choose =  input(mainMenu1());
       optionMainMenu(choose);
        break;
    case 2:
        findDiaryByUsername();
        break;
    case 3:
        deleteDiary();
        break;
    case 4:
        System.exit(404);
    default:
        input(mainMenu());
}

}catch (Exception f){
            input(mainMenu());
        }


    }

    private void optionMainMenu(String option) {
        switch (Integer.parseInt(option)){
            case 1-> lockDiary();

            case 2-> unlockDiary();

            case 3-> createEntry();

            case 4-> findEntryById();

            case 5-> updateEntry();

            case 6-> deleteEntry();

            case 7->
                method(option);
            default -> optionMainMenu(option);

        }
    }

    private void method(String option) {
        mainMenu();
        option(option);
    }

    private void deleteDiary() {
        try {
            String username = input("Enter your diary username");
            String password = input("Enter your diary password");
            diaries.delete(username, password);
            print("diary deleted successfully");

        }catch (Exception e){
            print(e.getMessage());
            print("diary not found");
            String option =  input(mainMenu());
            option(option);
        }
    }

    private void findDiaryByUsername() {
        try {
            String username = input("Enter your diary username");
             diary = diaries.findByUserName(username);
             print(diary.toString());
             String option =  input(mainMenu1());
             optionMainMenu(option);

        } catch (Exception e) {
            print(e.getMessage());
            String option =  input(mainMenu());
            option(option);
        }
    }

    private void addDiary() {
        try {
            String username = input("Enter your username");

            while (username.trim().isEmpty()) {
                username = input("Enter your username");
            }
            String password = input("Enter password");
                while (password.trim().isEmpty()) {
                    password = input("Enter password");
                }

            diary = diaries.addDiary(username, password);
            print("diary is added successfully");

        } catch (Exception e) {
            print(e.getMessage());
            String option =  input(mainMenu());
            option(option);

        }
//        finally {
//            mainMenu1();
//        }
    }



    public  void unlockDiary() {
        try {
            String password = input("Enter password to unlock");
            diary.unlock(password);
            print("<><><>Diary unlocked successfully");
            String option = input(mainMenu1());
            optionMainMenu(option);
        } catch (Exception e) {
            print(e.getMessage());
            print("invalid password, try again!!!!");
            String option = input(mainMenu1());
            option(option);

        }
    }

    public void createEntry(){
        try {
            String title = input("Enter title ");
            String body = input("Enter body");
            diary.createEntry(title, body);
            print("<><><<><><><>Entry created successfully");
            print(title + "\n" + body);
            print("your entry id is" + diary.generateId());
            String option = input(mainMenu1());
            optionMainMenu(option);
        }
         catch(Exception e) {
             print(e.getMessage());
             print("unlock your diary");
             String option = input(mainMenu1());
             option(option);


         }

    }

    public  void findEntryById(){

        try {
            String id = input("Enter id");
            diary.findEntryById(Integer.parseInt(id));
            print(id + " is found");
            String option = input(mainMenu1());
            optionMainMenu(option);
        }catch (Exception e){
            print("invalid input "+e.getMessage());
            String option = input(mainMenu1());
            optionMainMenu(option);
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
            String option = input(mainMenu1());
            optionMainMenu(option);

        } catch (Exception e) {
            print(e.getMessage());
            String option = input(mainMenu1());
            optionMainMenu(option);
        } finally {
            mainMenu1();
        }
    }



    public  void deleteEntry() {
        try {
            String id = input("Enter id to delete");
            diary.deleteEntry(Integer.parseInt(id));
            print(id + " is deleted successfully");
            String option = input(mainMenu1());
            optionMainMenu(option);
        } catch (Exception e) {
            print(e.getMessage());
            String option = input(mainMenu1());
            optionMainMenu(option);
        }
        finally {
            mainMenu1();
        }
    }

    public  void exitDiary(){
        System.exit(404);
        print("Thanks for using  Dark Royal diary");
        mainMenu1();
    }

    public  void lockDiary(){
        diary.lockDiary();
        print("diary locked successfully");
        String option = input(mainMenu1());
        optionMainMenu(option);
    }



}
