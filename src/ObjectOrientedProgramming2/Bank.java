package ObjectOrientedProgramming2;

import java.util.List;

public class Bank {

    private String name;

    private  List<Account> accounts;

    public Bank(List<Account> accounts){
        this.accounts = accounts;
    }



 public Account registerCustomer(String firstName, String lastName, String pin ){

        Account account = new Account(firstName + " " + lastName, 0,accounts.size() +1, pin);

        accounts.add(account);

        return account;


    }

    public void removeAccount(int number ){
        Account account1 = new Account();
    }

    public Account findAccount(int number){
        for(Account account: accounts):
            if(accounts.)

    }

    public List<Account> getAccount() {
        return accounts;

    }
}
