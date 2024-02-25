package ObjectOrientedProgramming2;

import javax.swing.*;
public class BankApp {


    private static final Bank bank = new Bank("ZenithBank", 1000);


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
        System.out.println("Welcome to Zenith Bank");
        System.out.println("<><><><><><><><><><><><><><><><><><><><><><><><><>");
        System.out.println("Here are set of thing you would like to look into\n" +
                "\t\t\tEnter 1:Create Bank Account\n" +
                "\t\t\tEnter 2:Deposit Amount\n" +
                "\t\t\tEnter 3:Withdraw Amount\n" +
                "\t\t\tEnter 4:Transfer Amount\n" +
                "\t\t\tEnter 6:Remove Account\n" +
                "\t\t\tEnter 7:Check Balance");
        System.out.println("<><><><><><><><><><><><><><><><><><><><><><><><><><>");
        options();
    }


    public static void options(){
        String number = input("Enter options on what you would like to do");

        switch (number.charAt(0)){
            case '1':
                createAccount();
            case '2':
                depositAmount();
            case '3':
                withdrawAmount();
            case '4':
                transferAmount();

  //        case '6':
    //            removeAccounts();
            case '7':
               checkBalances();
            case '0':
                exitProgram();
            default:
                mainMenu();

        }


    }


    public static void createAccount() {
       String firstName = input("Enter first name");
       String secondName = input("Enter second name");
       String pin = input("Enter pin");
        bank.registerCustomer(firstName,secondName,pin);
        System.out.println("<<<<<<<Account created successfully>>>>>>>");
        mainMenu();
    }

    public static void depositAmount() {
        try {
            String accountNumber = input("Enter account number to deposit");
            String amount = input("Enter amount to deposit");

            bank.deposit(Integer.parseInt(amount), Integer.parseInt(accountNumber));
            System.out.println("deposit successful" + " " + amount + " " + "have been deposited to" + " " + accountNumber);
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
            String amount = input("Enter amount to withdraw");
            String pin =input("Enter pin");

            bank.withdraw(Integer.parseInt(accountNumber), Integer.parseInt(amount), pin);
            System.out.println("Withdraw successful" +  " " + amount + " " + " " + "was withdrawn");

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
                String receiverAccountNumber = input("Enter receiver account number");
                String amount = input("Enter amount");
                String pin = input("Enter pin");
                bank.transfer(Integer.parseInt(amount), Integer.parseInt(senderAccountNumber), Integer.parseInt(receiverAccountNumber), pin);
                System.out.println(amount + " " + "is transferred from" + senderAccountNumber + "to" + receiverAccountNumber);


//                System.out.println(senderAccountNumber + "balance is remaining" + bank.checkBalance(pin, senderAccountNumber));
//                System.out.println(receiverAccountNumber + "balance is now" + bank.checkBalance(pin, receiverAccountNumber));
//

              }  catch (Exception e){
                print(e.getMessage());
                print("DO THE RIGHT THING");
            }
            finally {
                mainMenu();
            }
    }





    public static void removeAccounts() {
    }
    public static void checkBalances() {
        String accountNumber = input("Enter account number to check balance from");
        String pin = input("Enter pin");
        bank.checkBalance(pin,Integer.parseInt(accountNumber));
        System.out.println("The balance of " + accountNumber + "is " + bank.checkBalance(pin, Integer.parseInt(accountNumber)));
    }

    public static void exitProgram(){
        System.exit(404);
        System.out.println("<><><><><><><><>Thanks for banking with us<><><><><>");
    }

}
