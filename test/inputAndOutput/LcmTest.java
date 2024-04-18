package inputAndOutput;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

 public class LcmTest {

     @Test
     public void testLcm(){
         int[] number = {2,6,8};
         int[] expected = {2};
         assertArrayEquals(expected,Lcm.getLcm(number));
     }




}