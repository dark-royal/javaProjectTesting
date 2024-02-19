package ObjectOrientedProgramming2;

import java.util.List;

public class Bank {

    private String name;

    private  List<Account> accounts;

    public Bank(List<Account> accounts){
        this.accounts = accounts;
    }

    public List<Account> getAccount() {
        return accounts;
    }




    public Account registerCustomer(String firstName, String lastName, String pin ){

        Account account = new Account(firstName + " " + lastName, 0,accounts.size() +1, pin);

        accounts.add(account);

        return account;


    }

    public void deposit(int amount, int number){
        Account account = new Account("praise", 0,22179,"0123");
        account.deposit(5000);

    }

//    public int checkBalance(int number, String pin ) {
//        return  balance;
//    }

//    public void removeAccount(int number){
//        Account account1 = new Account("praise", 0, accounts.size() + 1, "1234");
//
//    }

//    public Account findAccount(int number){
//        for(Account account: accounts):
//            if(accounts.== number) {
//
//            }
    }





