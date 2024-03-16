package phoneBookTest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import phoneBookApp.PhoneBookApp;
import phoneBookApp.PhoneBookEmptyException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PhoneBookTest{

    private PhoneBookApp phoneBookApp;
    @BeforeEach
    public void initializer(){
        phoneBookApp = new PhoneBookApp();
    }

    @Test
    public void testThatPhonebookCanAddContact(){
       phoneBookApp.addContact("praise","090123432");
       assertEquals(1,phoneBookApp.getNumberOfContact());
    }

    @Test
    public void testThatPhonebookCanAddTwoContact(){
        phoneBookApp.addContact("praise","090123432");
        phoneBookApp.addContact("bimbim","090122920");
        assertEquals(2,phoneBookApp.getNumberOfContact());
    }

    @Test
    public void testThatPhonebookCanAddTwoContact_deleteOneContact() {
        phoneBookApp.addContact("praise", "090123432");
        phoneBookApp.addContact("bimbim", "090122920");
        phoneBookApp.deleteContact("bimbim", "090122920");
        assertEquals(2, phoneBookApp.getNumberOfContact());


    }

    @Test
    public void testPhoneBookDeleteContactWhenThereIsNoContactInThePhonebook(){
        assertThrows(PhoneBookEmptyException.class,()-> phoneBookApp.deleteContact("praise","09028979349"));
    }

}
