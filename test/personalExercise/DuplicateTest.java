package personalExercise;

import org.junit.jupiter.api.Test;
import personalExercises.Duplicate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DuplicateTest {
    @Test
    public void removeDuplicateTest(){
        int[] array = {1,2,2,5,3,7,1,7};
        int[] expected = {1,2,5,3,7,1};
        //assertEquals(expected, Duplicate.removeDuplicate(array));
    }
}
