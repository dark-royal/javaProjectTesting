import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TelevisionTest {

    private Television tv;

    @BeforeEach
    public void initializer() {
        tv = new Television();
    }


    @Test
    public void testTvIsOn_tvIsOn() {
        assertFalse(tv.myTvIsOn());
        tv.powerOn();
        assertTrue(tv.myTvIsOn());
    }

    @Test
    public void testTvIsOff_tvIsOff() {
        tv.powerOn();
        assertTrue(tv.myTvIsOn());
        tv.powerOff();
        assertFalse(tv.myTvIsOn());
    }

    @Test
    public void testTvCanIncreaseVolume_tvVolumeIsIncreased() {
        tv.powerOn();
        assertTrue(tv.myTvIsOn());

        assertEquals(0, tv.getVolume());
        tv.increaseVolume();

        for (int index = 0; index < 4; index++) {
            tv.increaseVolume();
        }
        assertEquals(5, tv.getVolume());


    }

    @Test
    public void testTvCanDecreaseVolume_tvDecreaseVolume() {
        tv.powerOn();
        assertTrue(tv.myTvIsOn());

        assertEquals(0, tv.getVolume());
        tv.increaseVolume();

        for (int index = 0; index < 4; index++) {
            tv.increaseVolume();
        }
        for( int index = 4; index >= 0; index++){
            tv.decreaseVolume();
        }
        assertEquals(0, tv.getVolume());

    }

    @Test
    public void testThatTvCanChangeChannel_tvCanChangeChannel(){
        tv.powerOn();
        assertTrue(tv.myTvIsOn());


        tv.forwardChannel();
        //assertEquals(0,tv.getChannel());


        for(int index = 1; index < 10; index++){
            tv.forwardChannel();
        }
        assertEquals(10, tv.getChannel());
    }


}
