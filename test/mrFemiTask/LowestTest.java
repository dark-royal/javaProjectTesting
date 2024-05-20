package mrFemiTask;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LowestTest {

    @Test
    public void lowest(){
        int[] number = {10,3,6};
        int[] expected = {3,1,2};
        assertArrayEquals(expected,Lowest.getLowestPosition(number));
    }

}