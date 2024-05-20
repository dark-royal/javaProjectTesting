package inputAndOutput;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddToLastIndexTest {
    @Test
    public void testAdditionOfTheLastIndex(){
        int[] number = {5,2,3,1,2};
        int[] expected = {5,2,3,1,3};
        assertArrayEquals(expected,AddToLastIndex.addOneToLastIndex(number));
    }

}