package personalExercises;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DuplicateTest {

    @Test
    public void test_remove_duplicate(){
        int[] array = {1,1,2,2,3,1,4,5};
        int[]expected = {1,2,3,4,5};
        assertEquals(Arrays.toString(expected),Duplicate.removeDuplicate(array));
    }
}
