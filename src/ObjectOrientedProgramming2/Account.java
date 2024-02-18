package ObjectOrientedProgramming2;

import java.util.List;

public class Account {

    private String name;
    private int balance = 0;
    private String pin;
    private int number;


    public Account(String name,int balance, int number, String pin){
        this.name = name;
        this.balance = balance;
        this.number = number;
        this.pin = pin;

    }

    public int getBalance(){
        return balance;
    }


    public void deposit(int amount) {
        validateDeposit(amount);
        balance += amount;

    }


    public void validateDeposit(int amount){
        if(amount <=  0) throw new InvalidAmountException("amount should be greater than zero");
    }

    public void withdraw(int amount) {
        validateWithdraw(amount);
        balance -= amount;
    }

    public void validateWithdraw(int amount){
        if(amount <  0) throw  new InvalidAmountException("negative number cannot be withdrawn");
        if(amount > balance) throw new InsufficientFunctionException("amount above balance cannot be withdrawn");
    }


    public void checkBalance() {
    }
}

