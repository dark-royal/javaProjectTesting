package chapterThree;

public class Account {

    private int balance;

    public int getBalance() {
        return balance;

    }

    public void deposit(int amount) {
        if (amount <= 0) {
        } else {
            balance += amount;
        }

    }

    public void withdraw(int amount) {
        if (amount < 0) {
            balance = 0;
        }


    }

    public void deposit1(int amount) {
        if (amount >= 0) {
            balance = amount;
        }

    }

    public void withdraw1(int amount) {
        if (amount > 0) {
            balance = balance - amount;
        }


    }

    public void withdraw2(int amount) {
        if (amount > balance) {
            balance = balance;
        }
    }
}



