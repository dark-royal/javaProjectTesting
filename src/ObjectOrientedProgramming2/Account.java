package ObjectOrientedProgramming2;

public class Account {

    private String name;
    private int balance = 0;
    private final String pin;
    private final int number;


    public Account(String name, int number, String pin){
        this.name = name;
        this.number = number;
        this.pin = pin;

    }



    public int getBalance(String pin){
        validatePin(pin);
        return balance;
    }


    public void deposit(int amount) {

        validateDeposit(amount);
        validatePin(pin);
        balance += amount;

    }


    public void validateDeposit(int amount){
        if(amount <=  0) throw new InvalidAmountException("amount should be greater than zero");
    }

    public void withdraw(int amount,String pin) {
        validateWithdraw(amount);
        validatePin(pin);
        balance -= amount;
    }

    public void validateWithdraw(int amount){
        if(amount <=  0) throw  new InvalidAmountException("negative number cannot be withdrawn");
        if(amount > balance) throw new InsufficientFunctionException("amount above balance cannot be withdrawn");
    }

    public void validatePin(String pin){
        if(!this.pin.equals(pin))throw new InvalidPinException("pin is incorrect");


        }


    public int getAccountNumber() {
        return number;
    }
}





