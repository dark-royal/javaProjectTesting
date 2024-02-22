package ObjectOrientedProgramming2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BankTest {

    private Bank bank;

    private final ArrayList<Account> accounts = new ArrayList<>();

    @BeforeEach
    public void initializer() {
        bank = new Bank("Zenith bank",1000);
    }

    @Test
    public void registerCustomerTest() {
        Account account1 = bank.registerCustomer("praise", "oyewole", "1234");
        Account account2 = bank.registerCustomer("israel", "nwanoloziri", "6841");
        Account account3 = bank.registerCustomer("ajibola", "hannah", "0912");
        assertEquals(3, bank.getAccount().size());

    }
    @Test
    public void findAccount(){
        Account account = bank.registerCustomer("dayo","Akindayo","1234");
        Account account1 = bank.registerCustomer("Florence","Gold", "5678");
        Account account2 = bank.registerCustomer("betty", "isaac", "2007");

        assertEquals(account2,bank.findAccount(1003));

    }





    @Test
    public void removeAccount(){
        Account account = bank.registerCustomer("kuse","joshua","6841");
        bank.removeAccount(1001,"6841");
        assertEquals(account,account.getAccountNumber();
    }

    @Test
    public void withdraw(){
        Account account = bank.registerCustomer("jummy", "joseph","1234");
        Account account1 = bank.registerCustomer("micheal","dikandu","1516");
        bank.deposit(3000,1002);
        bank.withdraw(1002,1000,"1516");
        assertEquals(2000,account1.getBalance("1516"));

    }

    @Test
    public void transfer(){
        Account senderAccountNumber = bank.registerCustomer("Dominic", "countinho","6841");
        Account receiverAccountNumber = bank.registerCustomer("praise", "nun","1234");
        bank.deposit(5000,1001);
        bank.transfer(3000,1002,1001,"6841");
        assertEquals(2000,senderAccountNumber.getBalance("6841"));
    }

    @Test
    public void transferAmountWithWrongPin_throwInvalidPinException(){
        Account senderAccountNumber = bank.registerCustomer("praise","oye","2233");
        Account receiverAccountNumber = bank.registerCustomer("florence","gold","1212");
        bank.deposit(2000,1001);
        assertThrows(InvalidPinException.class,()-> bank.transfer(1000,1002,1001,"1212"));


    }
    @Test
    public void checkBalance() {
        Account account = bank.registerCustomer("jack", "jacob", "4545");
        assertEquals(0, account.getBalance("4545"));


        }
}


    //}