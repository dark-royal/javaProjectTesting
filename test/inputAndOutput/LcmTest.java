package inputAndOutput;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

 public class LcmTest {

     @Test
     public void testLcm(){
         int[] number = {4,10,8};
        int expected = 2;
         assertEquals(expected,Lcm.getLcm(number));
     }




}