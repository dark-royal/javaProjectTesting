package phoneBookTest;

import org.junit.jupiter.api.Test;
import phoneBookApp.PhoneBookApp;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PhoneBookTest{

    private PhoneBookApp phoneBookApp;

    public void initializer(){
        phoneBookApp = new PhoneBookApp();
    }

    @Test
    public void testThatPhonebookCanAddContact(){
       phoneBookApp.addContact("praise","090123432");
       assertEquals(1,phoneBookApp.getNumberOfContact());
    }


}
