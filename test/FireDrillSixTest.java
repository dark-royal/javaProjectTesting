import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FireDrillSixTest {

    @Test
    public void replaceEvenAndOddWith0AndOneRespectivelyTest(){
        int[] array = {4,5,8,8,8,2,9};
        int[] newArray = {0,1,0,0,0,0,1};
        assertArrayEquals(newArray,FireDrillSix.replaceNumber(array));


    }
}
