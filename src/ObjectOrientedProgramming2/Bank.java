package ObjectOrientedProgramming2;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    ;
    private String bankName;

    private int accountNumber;

    private final List<Account> accounts;

    public Bank(String bankName, int accountNumber) {
        this.bankName = bankName;
        this.accountNumber = accountNumber;
        this.accounts = new ArrayList<>();
    }

    public List<Account> getAccount() {
        return accounts;
    }


    public Account registerCustomer(String firstName, String lastName, String pin) {
        int accountNumber = generateAccount();
        Account account = new Account(firstName + " " + lastName, accountNumber, pin);

        accounts.add(account);

        return account;


    }

    private int generateAccount() {
        return ++accountNumber;
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
        for (Account account : accounts) {
            if (account.getAccountNumber() == senderAccountNumber) {
                account.deposit(amount);
                account.withdraw(amount, pin);

                for (Account account1 : accounts) {
                    if (account1.getAccountNumber() == receiverAccountNumber) {
                        account1.deposit(amount);
                    }
                }
            }
        }


    }


    public void withdraw(int accountNumber, int amount, String pin) {
        Account account = findAccount(accountNumber);
        account.withdraw(amount, pin);
    }

//    public void removeAccount(int accountNumber,String pin){
//
//        }
//    }
//    }
}