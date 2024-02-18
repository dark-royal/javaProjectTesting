package personalExercise;

import org.junit.jupiter.api.Test;
import personalExercises.TwoSum;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TwoSumTest {

    @Test
    public void testTwoSum() {
        int target = 9;
        int[] nums = {3, 2, 5, 7};
        assertArrayEquals(new int[]{1, 3}, TwoSum.twoSumIndices(nums, target));


    }
}