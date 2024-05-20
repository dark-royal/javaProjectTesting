package mrFemiTask;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseWordTest {

    @Test
    public void testReversedWord(){
        String  word = "it is still a beautiful world";
        String expected ="world beautiful a still is it ";
        assertEquals(expected,ReverseWord.reverseWord(word));
    }
}