import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinMaxTest {
    @Test
    public void addArrayAndReturnTheMinAndMax(){
        int[] array = {3, 4, 2, 5, 1};
        int[] expected = {10, 14};
        assertEquals(expected,MinMax.findMinAndMax(array));
    }
}
