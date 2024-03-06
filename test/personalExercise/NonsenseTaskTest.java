package personalExercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NonsenseTaskTest {
    @Test
    public void Counter(){
        int[] array = {2,1,2,1,5,7};
        int[] expected = {2,2,1,1};
        assertEquals(expected,NonsenseTask.countArray(array));
    }

}