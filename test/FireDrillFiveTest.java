import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FireDrillFiveTest {

    @Test
    public void testThatFunctionCanTakeAnArray_returnDoubleLength(){
        int[] array = {4, 5, 8,3};
        assertEquals(8,FireDrillFive.doubleLength(array).length);

    }

    @Test
    public void testThatElementInTheArrayCanDouble_ElementIsDoubled(){
        int[] array = {4, 5, 8,3};
        assertEquals(8,FireDrillFive.doubleLength(array).length);


    }


}
