package ObjectOrientedProgramming2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class AccountTest {

    private Account account;

    @BeforeEach
    public  void initializer(){
        account = new Account("praise", 0,123,"6841");

    }

    @Test
    public void deposit(){

        assertEquals(0,account.checkBalance());
        account.deposit(2000);
        assertEquals(2000,account.checkBalance());

    }

    @Test
    public void depositMoreThanOneAMount(){
        assertEquals(0,account.checkBalance());
        account.deposit(2000);
        account.deposit(3000);
        account.deposit(1000);
        assertEquals(6000,account.checkBalance());
    }

    @Test
    public void depositNegativeAmount(){
        assertEquals(0,account.checkBalance());

        //account.deposit(-2000);
        assertThrows(InvalidAmountException.class, ()->account.deposit(-2000));

    }

    @Test
    public void withdraw(){
        assertEquals(0,account.checkBalance());
        account.deposit(2000);
        account.withdraw(1000,"6841");
        assertEquals(1000,account.checkBalance());
    }

    @Test
    public void withdrawMoreThanBalanceTest(){
        assertEquals(0,account.checkBalance());
        account.deposit(5000);
        assertThrows(InsufficientFunctionException.class,()-> account.withdraw(6000,"6841"));
    }

    @Test
    public void withdrawNegativeAmount_throwInvalidAmountException(){
        assertEquals(0, account.checkBalance());
        assertThrows(InvalidAmountException.class,()-> account.withdraw(-2000,"6841"));


    }
    @Test
    public void withdrawZero_throwInvalidAmountException(){
        assertEquals(0,account.checkBalance());

        assertThrows(InvalidAmountException.class,()-> account.withdraw(0,"6841"));
    }

    @Test
    public void checkBalanceTest(){
        account.deposit(2000);
        account.checkBalance();
        assertEquals(2000,account.checkBalance());
    }

    @Test
    public void depositZero_throwInvalidAmountException(){
        assertEquals(0,account.checkBalance());

        assertThrows(InvalidAmountException.class,()-> account.deposit(0));
    }

    @Test
    public void withdrawWithIncorrectPin_throwInvalidPinException(){
        assertEquals(0,account.checkBalance());
        account.deposit(2000);
        assertThrows(InvalidPinException.class,()-> account.withdraw(2000,"1234"));
    }





}
