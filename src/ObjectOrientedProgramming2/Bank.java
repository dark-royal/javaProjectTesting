package ObjectOrientedProgramming2;

import java.util.ArrayList;
import java.util.List;

public class Bank {


    private String bankName;

    private int  accountNumber = 1 ;

    private final List<Account> accounts = new ArrayList<>() ;

    public Bank(String bankName) {
        this.bankName = bankName;
    }
    public Bank (){
        this(null);
    }
    public Account registerCustomer(String firstName, String lastName, String pin) {
        Account account = new Account(firstName,lastName,pin);
        account.setNumber(accountNumber);
        accounts.add(account);
        accountNumber++;
        return account;
    }



    public int getNumberOfAccount() {
        return accounts.size();
    }

    public int checkBalance(String pin, int accountNumber) {
        Account account = findAccount(accountNumber);
        return account.getBalance(pin);
    }

    public void deposit(int amount, int accountNumber) {
        Account account = findAccount(accountNumber);
        account.deposit(amount);

    }


    public Account findAccount(int accountNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber() == accountNumber) {
                return account;
            }
        }
        throw new IllegalArgumentException("no  such account  is found ");
    }

    public void transfer(int amount, int receiverAccountNumber, int senderAccountNumber, String pin) {
        Account senderAccountNum = findAccount(senderAccountNumber);
        Account receiverAccountNum = findAccount(receiverAccountNumber);
        senderAccountNum.withdraw(amount, pin);
        receiverAccountNum.deposit(amount);
    }


    public void withdraw(int accountNumber, int amount, String pin) {
        Account account = findAccount(accountNumber);
        account.withdraw(amount, pin);
    }

    public void removeAccount(int accountNumber, String pin) {
        Account account = findAccount(accountNumber);
        account.validatePin(pin);
        accounts.remove(account);
    }
}