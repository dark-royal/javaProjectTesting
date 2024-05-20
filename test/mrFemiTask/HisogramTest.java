package mrFemiTask;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HisogramTest {

    @Test
    public void testHisogram(){
        String word = "the quick brown fox jumps over the lazy dog";
        assertTrue(Hisogram.hisogram(word), word);
    }

}