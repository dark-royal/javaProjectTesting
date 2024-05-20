package mrFemiTask;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdditionTest {
    @Test
    public void testAddition() {

        int expected = 9;

        assertEquals(expected,Addition.addNumbers(5,4));
    }

    @Test
    public void testAddittion2(){
        int expected = -5;
                assertEquals(expected,Addition.addNumbers(0,-5));
    }



}