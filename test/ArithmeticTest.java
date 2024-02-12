import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArithmeticTest {

    @Test
    public void squareFunctionTest(){
        assertEquals(16,Arithmetic.squareOf(4));
    }

    @Test
    public void SquareNegativeNUmberTest(){
        assertEquals(16,Arithmetic.squareOfNegative(-4));
    }

    @Test
    public void addTwoNumbersTest(){
        assertEquals(16,Arithmetic.addNumbers(8, 8));

    }

    @Test
    public void addMultipleNumberTest(){
        assertEquals(24,Arithmetic.addMultipleNumbers(3,5,7,6,2,1));
    }

    @Test
    public void divideTwoNumbers(){
        assertEquals(3,Arithmetic.divideTwoNUmbers(24,8));

    }

    @Test
    public void divideTwoNegativeNumber(){
        assertEquals(3,Arithmetic.divideTwoNegativeNumber(-24, -8));
    }

    @Test
    public void getMaxOf(){
        assertEquals(33,Arithmetic.getMaxOf(4,9,7,14,33,6));
    }

    @Test
    public void getMinOf(){
        assertEquals(12,Arithmetic.getMInOf(23,14,12,88,45,32));
    }

}
