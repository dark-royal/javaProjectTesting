package ObjectOrientedProgramming2;

import javax.swing.*;
public class BankApp {


    private static final Bank bank = new Bank();


    public static void main(String[] args) {
        mainMenu();
    }


    public static String input(String prompt){
        return JOptionPane.showInputDialog(prompt);
    }

    public static void print(String output){
        JOptionPane.showMessageDialog(null,"output" );
    }
    public  static void mainMenu(){
        String returnValue = input("""
                
        Welcome to Zenith Bank
        <><><><><><><><><><><><><><><><><><><><><><><><><>
       
        Here are set of thing you would like to look into
        Enter 1:Create Bank Account
        Enter 2:Deposit Amount
        Enter 3:Withdraw Amount
        Enter 4:Transfer Amount
        Enter 5:Remove Accountl
        Enter 6:Check Balance
        Enter 7:exit program
        <><><><><><><><><><><><><><><><><><><><><><><><><><>""");
        options(returnValue);
    }


    public static void options(String number){

        switch (number){
            case "1":
                createAccount();
            case "2":
                depositAmount();
            case "3":
                withdrawAmount();
            case "4":
                transferAmount();
            case "5":
                removeAccounts();
            case "6":
               checkBalances();
            case "7":
                exitProgram();
            default:
                mainMenu();

        }


    }


    public static void createAccount() {
        try {
            String firstName = input("Enter first name");
            while (firstName.trim().isEmpty()) {
                firstName = input("Enter first name");
            }
            String secondName = input("Enter second name");
            while (secondName.trim().isEmpty()) {
                secondName = input("Enter second name");
            }
            String pin = input("Enter pin");
            while (pin.trim().isEmpty()) {
                pin = input("Enter pin");
            }
            bank.registerCustomer(firstName, secondName, pin);
            print("<<<<<<<Account created successfully>>>>>>>");
        }catch (Exception e){
            print(e.getMessage());
        }
        finally {
            mainMenu();
        }
    }

    public static void depositAmount() {
        try {
            String accountNumber = input("Enter account number to deposit");
            while(accountNumber.trim().isEmpty()){
                accountNumber = input("Enter account number to deposit");
            }
            String amount = input("Enter amount to deposit");
            while ((amount.trim().isEmpty())){
                amount = input("Enter amount to deposit");
            }

            bank.deposit(Integer.parseInt(amount), Integer.parseInt(accountNumber));
            print("deposit successful" + " " + amount + " " + "have been deposited to" + " " + accountNumber);
        }catch (Exception e) {
            print(e.getMessage());
            print("DO THE RIGHT THING");
        }

        finally{
            mainMenu();


        }
    }



    public static void withdrawAmount() {
        try{
            String accountNumber = input("Enter account number to withdraw from");
            while(accountNumber.trim().isEmpty()){
                accountNumber = input("Enter account number to withdraw from");
            }
            String amount = input("Enter amount to withdraw");
            while (amount.trim().isEmpty()){
                amount = input("Enter amount to withdraw");
            }
            String pin =input("Enter pin");
            while(pin.trim().isEmpty()){
                pin = input("Enter pin");
            }

            bank.withdraw(Integer.parseInt(accountNumber), Integer.parseInt(amount), pin);
            print("Withdraw successful" +  " " + amount + " " + " " + "was withdrawn");

        }catch(Exception e) {
            print(e.getMessage());
            print("DO THE RIGHT THING");
        }

        finally {
            mainMenu();
        }

    }

    public static void transferAmount() {
            try {
                String senderAccountNumber = input("Enter sender account number");
                while(senderAccountNumber.trim().isEmpty()){
                    senderAccountNumber = input("Enter sender account number");
                }
                String receiverAccountNumber = input("Enter receiver account number");
                while (receiverAccountNumber.trim().isEmpty()){
                    receiverAccountNumber = input("Enter receiver account number");
                }
                String amount = input("Enter amount");
                while(amount.trim().isEmpty()){
                    amount = input("Enter amount");
                }
                String pin = input("Enter pin");
                while (pin.trim().isEmpty()){
                    pin = input("Enter pin");
                }
                bank.transfer(Integer.parseInt(amount), Integer.parseInt(senderAccountNumber), Integer.parseInt(receiverAccountNumber), pin);
                print(amount + " " + "is transferred from" + senderAccountNumber + "to" + receiverAccountNumber);


                print(senderAccountNumber + "balance is remaining" + bank.checkBalance(pin, Integer.parseInt(senderAccountNumber)));
                print(receiverAccountNumber + "balance is now" + bank.checkBalance(pin, Integer.parseInt(receiverAccountNumber)));


              }  catch (Exception e){
                print(e.getMessage());
                print("DO THE RIGHT THING");
            }
            finally {
                mainMenu();
            }
    }





    public static void removeAccounts() {
        try{
            String accountNumber = input("Enter account number");
            while (accountNumber.trim().isEmpty()){
                accountNumber = input("Enter account number");
            }

            String pin = input("Enter pin");
            while (pin.trim().isEmpty()){
                pin = input("Enter pin");
            }
            bank.removeAccount(Integer.parseInt(accountNumber),pin);
            print("Account removed successfully");
        }catch (Exception e){
            print(e.getMessage());
        }
        finally {
            mainMenu();
        }

    }
    public static void checkBalances() {
        try {
            String accountNumber = input("Enter account number to check balance from");
            while (accountNumber.trim().isEmpty()){
                accountNumber = input("Enter account number to check balance from");
            }
            String pin = input("Enter pin");
            while (pin.trim().isEmpty()){
                pin = input("Enter pin");
            }
            bank.checkBalance(pin, Integer.parseInt(accountNumber));
            print("The balance of " + accountNumber + "is " + bank.checkBalance(pin, Integer.parseInt(accountNumber)));
        }catch (Exception e){
            print(e.getMessage());
        }
        finally {
            mainMenu();
        }
    }

    public static void exitProgram(){
        System.exit(404);
        print("<><><><><><><><>Thanks for banking with us<><><><><>");
    }

}
