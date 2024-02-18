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
//       accounts.add(account1);
//       accounts.add(account2);
//       accounts.add(account3);

       assertEquals(3,accounts.size());
    }
    }



