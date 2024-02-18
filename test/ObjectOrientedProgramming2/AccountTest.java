package ObjectOrientedProgramming2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class AccountTest {

    private Account account;

    @BeforeEach
    public  void initializer(){
        account = new Account("praise", 0,123,"1234");

    }

    @Test
    public void deposit(){

        assertEquals(0,account.getBalance());
        account.deposit(2000);
        assertEquals(2000,account.getBalance());

    }
    @Test
    public void deposit1(){
        assertEquals(0,account.getBalance());

        //account.deposit(-2000);
        assertThrows(InvalidAmountException.class, ()->account.deposit(-2000));

    }

    @Test
    public void withdraw(){
        assertEquals(0,account.getBalance());
        account.deposit(2000);
        account.withdraw(1000);
        assertEquals(1000,account.getBalance());
    }

    @Test
    public void withdrawMoreThanBalanceTest(){
        assertEquals(0,account.getBalance());
        account.deposit(5000);
        assertThrows(InsufficientFunctionException.class,()-> account.withdraw(6000));
    }

    @Test
    public void withdrawNegativeAmount_throwInvalidAmountException(){
        assertEquals(0, account.getBalance());
        assertThrows(InvalidAmountException.class,()-> account.withdraw(-2000));


    }

    public void checkBalanceTest(){
        account.deposit(2000);
        account.checkBalance();
        assertEquals(2000,account.getBalance());
    }

//    @Test
//    public void v


}
