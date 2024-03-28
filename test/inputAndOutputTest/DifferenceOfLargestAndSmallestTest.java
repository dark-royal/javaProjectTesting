package inputAndOutputTest;

import inputAndOutput.DifferenceOfLargestAndSmallest;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DifferenceOfLargestAndSmallestTest {
    @Test
    public void differnce(){
        int [] array = {2,4,5,9,8};
        int[]expected = {7};
        assertArrayEquals(expected,DifferenceOfLargestAndSmallest.differnce(array));
    }
}
