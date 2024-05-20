package mrFemiTask;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MultiplicationTest {

    @Test
    public void testLargestMultiplication(){
        int[] numbers = {-10, 0, -4, 1, -6};
        assertEquals(60,Multiplication.getLargestMultiplication(numbers));
    }

    @Test
    public void testZeroToTheLast(){
        int[] numbers = {3,2,0,-1,7,0,8,0,0,4,5,2,0,0,1,2,3,};
        int[] expected = {3,2,-1,7,8,4,5,2,1,2,3,0,0,0,0,0,0};
        assertArrayEquals(expected,Multiplication.moveZeroToLast(numbers));
    }

}




