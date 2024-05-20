package chapter15.json;

public class Transaction {
    private String accountNumber;
    private String amount;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public Transaction(String accountNumber, String amount) {
        this.accountNumber = accountNumber;
        this.amount = amount;
    }
}
