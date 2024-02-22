package ObjectOrientedProgramming2;
import java.util.Scanner;
public class BankApp  extends Bank{


    private static BankApp bankApp = new BankApp("ZenithBank", 1000);



   static final Scanner scanner = new Scanner(System.in);

    public BankApp(String bankName, int accountNumber) {
        super(bankName, accountNumber);
    }

    public static void main(String[] args) {
        bankApp.display1();

    }

    public void display1(){
        System.out.println("Welcome to Zenith Bank");
        display();
    }

    public  void display() {
        System.out.println("<><><><><><><><><><><><><><><><><><><><><><><><><>");
        System.out.println("Here are set of thing you would like to look into\n" +
                "\t\t\tEnter 1: Create Bank Account\n" +
                "\t\t\tEnter 2:Deposit Amount\n" +
                "\t\t\tEnter 3:Withdraw Amount\n" +
                "\t\t\tEnter 4:Transfer Amount\n" +
                "\t\t\tEnter 5:Find Account\n" +
                "\t\t\tEnter 6:Remove Account\n" +
                "\t\t\tEnter 7:Check Balance");
        System.out.println("<><><><><><><><><><><><><><><><><><><><><><><><><><>");
        bankApp.options();
    }


    public  void options(){
        System.out.println("Enter options on what you would like to do");
        int number = scanner.nextInt();

        switch (number){
            case 1:
                bankApp.createAccount();
            case 2:
                depositAmount();
            case 3:
                withdrawAmount();
          case 4:
                transferAmount();
            case 5:
//                findAccounts();
//            case 6:
//                removeAccounts();
//            case 7:
//                checkBalances();
//            case 0:
//                System.exit(404);
//            default:
//                display();

        }


    }


    public  void createAccount() {
        System.out.println("Enter first name");
        String firstName = scanner.next();
        System.out.println("Enter second name");
        String secondName =scanner.next();
        System.out.println("Enter pin");
        String pin = scanner.next();
        bankApp.registerCustomer(firstName,secondName,pin);
        System.out.println("<<<<<<<Account created successfully>>>>>>>");
        display();
    }

    public static void depositAmount() {
        boolean control = true;

            do {
                try {
                    System.out.println("Enter account number to deposit to");
                    int accountNumber = scanner.nextInt();

                    System.out.println("Enter amount to deposit");
                    int amount = scanner.nextInt();
                    System.out.println("Enter pin");
                    String pin = scanner.next();
                    bankApp.deposit(amount, accountNumber);

                    System.out.println("deposit successful" + " " + amount + " " + "have been deposited to" + " " + accountNumber);
                    bankApp.checkBalance(pin, accountNumber);
                    System.out.println(accountNumber + " " + "balance is" + bankApp.checkBalance(pin, accountNumber));
                    bankApp.display();
                    control = false;
                } catch (IllegalArgumentException | InvalidAmountException | InvalidPinException e) {
                    System.out.println("error");
                }
            }while(control);
    }

    public static void withdrawAmount() {

        boolean condition = true;

        do{
            try {

                System.out.println("Enter account number to withdraw from");
                int accountNumber = scanner.nextInt();
                System.out.println("Enter amount to withdraw");
                int amount1 = scanner.nextInt();
                System.out.println("Enter pin");
                String pin = scanner.next();
                bankApp.withdraw(accountNumber, amount1, pin);
                System.out.println("Withdraw successful" +  " " + amount1 + " " + "was withdrawn");
                System.out.println(accountNumber + " " + "balance  is" + bankApp.checkBalance(pin, accountNumber));
                bankApp.display();
                condition = false;
            }catch(IllegalArgumentException | InvalidAmountException | InvalidPinException e) {
                System.out.println("error");
            }
            } while (condition);
    }

    public static void transferAmount() {
        boolean condition = true;
        do{
            try {
                System.out.println("Enter sender account number");
                int senderAccountNumber = scanner.nextInt();
                System.out.println("Enter receiverAccountNumber");
                int receiverAccountNumber = scanner.nextInt();
                System.out.println("Enter amount");
                int amount = scanner.nextInt();
                System.out.println("Enter pin");
                String pin = scanner.next();
                bankApp.transfer(amount, senderAccountNumber, receiverAccountNumber, pin);
                System.out.println(amount + " " + "is transferred from" + senderAccountNumber + "to" + receiverAccountNumber);
                System.out.println(senderAccountNumber + "balance is remaining" + bankApp.checkBalance(pin, senderAccountNumber));
                System.out.println(receiverAccountNumber + "balance is now" + bankApp.checkBalance(pin, receiverAccountNumber));
                bankApp.display();
                condition = false;
            } catch (IllegalArgumentException | InvalidAmountException | InvalidPinException e) {
                System.out.println("error");
            }
        }while (condition);
    }




    public static void findAccounts() {
        boolean condition = true;
        do {
            try {
                System.out.println("Enter account number");
                int accountNumber = scanner.nextInt();
                bankApp.findAccount(accountNumber);
                System.out.println(accountNumber);
                bankApp.display();
                condition = false;
            }catch(IllegalArgumentException e){
        }while(condition);
    }


    public static void removeAccounts() {
    }
    public static void checkBalances() {
        System.out.println("Enter pin");
        String pin = scanner.next();
        System.out.println("Enter account number to check balance from");
        int accountNumber = scanner.nextInt();
        bankApp.checkBalance(pin,accountNumber);
        System.out.println("The balance of " + accountNumber + "is " + bankApp.checkBalance(pin,accountNumber));
    }

}
