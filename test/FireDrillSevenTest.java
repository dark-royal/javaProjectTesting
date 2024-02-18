import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FireDrillSevenTest {

    @Test
    public void replaceNumbers(){
        int[] array = {4, 5, 8, 8, 8, 2, 9};
        assertArrayEquals(new boolean[]{false,true,false,false,false,false,true},FireDrillSeven.replaceNUmber(array));
    }
}
