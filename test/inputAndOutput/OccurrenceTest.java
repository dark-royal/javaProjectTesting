package inputAndOutput;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OccurrenceTest {

    @Test
    public void testNumberWhichOccursTheMost(){
        int[] number = {1,1,2,2,2,};
        int  expected = 2;
        assertEquals(expected,Occurrence.getNumberWhichOccursTheMost(number));
    }

}