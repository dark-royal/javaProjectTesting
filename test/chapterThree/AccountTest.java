package chapterThree;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {
    @Test
    public void depositNegativeBalance_balanceRemainUnchangedTest(){
        Account praiseAccount = new Account();
        assertEquals(0,praiseAccount.getBalance());

        praiseAccount.deposit(-50_000);
        assertEquals(0,praiseAccount.getBalance());

    }

    @Test
    public void depositPositiveAmount_balanceIncreasesTest(){
        Account praiseAccount = new Account();
        assertEquals(0,praiseAccount.getBalance());

        praiseAccount.deposit(2_000);
        assertEquals(2_000,praiseAccount.getBalance());

    }

    @Test
    public void depositPositiveAmountTwice(){
        Account praiseAccount = new Account();
        assertEquals(0,praiseAccount.getBalance());


        praiseAccount.deposit(2_000);
        praiseAccount.deposit(4_000);
        assertEquals(6000,praiseAccount.getBalance());


    }

    @Test
    public void withDrawNegativeAmount(){
        Account praiseAccount = new Account();
        assertEquals(0,praiseAccount.getBalance());

        praiseAccount.withdraw(-20_000);
        assertEquals(0,praiseAccount.getBalance());


    }

    @Test
    public void depositPositiveAmount(){
        Account praiseAccount = new Account();
        assertEquals(0,praiseAccount.getBalance());

        praiseAccount.deposit(1200);
        assertEquals(1200,praiseAccount.getBalance());

    }

    @Test
    public void withdrawPositiveAmount(){
        Account praiseAccount = new Account();
        assertEquals(0,praiseAccount.getBalance());

        praiseAccount.deposit(1200);
         praiseAccount.withdraw1(1_000);
        assertEquals(200, praiseAccount.getBalance());

    }

    @Test
    public void withDraw2(){
        Account praiseAccount = new Account();
        assertEquals(0,praiseAccount.getBalance());

        praiseAccount.deposit(200);
        praiseAccount.withdraw2(50_000);
        assertEquals(200,praiseAccount.getBalance());


    }


}
