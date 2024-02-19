package ObjectOrientedProgramming2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTest {

    private Bank bank;

    private final ArrayList<Account> accounts = new ArrayList<>();

    @BeforeEach
    public void initializer(){
        bank = new Bank(accounts);
    }
    @Test
    public void registerCustomerTest(){
       Account account1 = bank.registerCustomer("praise", "oyewole", "1234");
       Account account2 = bank.registerCustomer("israel", "nwanoloziri", "6841");
       Account account3 = bank.registerCustomer("ajibola", "hannah", "0912");

       assertEquals(3,accounts.size());

    }


//    @Test
//    public void deposit(){
//        Account account = new Account("praise",0,12345,"1234");
//        bank.deposit(5000,1234);
//        bank.deposit(2000,45432);
//        assertEquals(7000,bank.galance(2123,"1234"));
//    }
    }



