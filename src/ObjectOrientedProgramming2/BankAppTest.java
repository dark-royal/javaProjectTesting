package ObjectOrientedProgramming2;

public class BankAppTest extends BankApp{
    public BankAppTest(String bankName, int accountNumber) {
        super(bankName, accountNumber);
    }

    public static void main(String[] args) {
        BankAppTest bankAppTest = new BankAppTest("Zenith Bank", 1000);
        bankAppTest.display1();

    }
}
