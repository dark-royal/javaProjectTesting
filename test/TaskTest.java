import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaskTest {

    @Test
    public void test_occurrence(){
        int[] numbers = {1,2,3,2,2,1};
        int[] expected = {3,2};
        assertEquals(expected,Task.getOccurrence(numbers));
    }

}