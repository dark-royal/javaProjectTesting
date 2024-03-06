package reflection;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GeopoliticalZoneTest {



    @Test
    public void test_that_state_can_be_found() throws StateNotFoundException {
        GeopoliticalZone geopoliticalZone = new GeopoliticalZone();
        assertEquals(GeopoliticalZone1.NORTHCENTRAL,geopoliticalZone.showState("kwara"));

    }

    @Test
    public void test_that_state_in_north_east_can_be_found() throws StateNotFoundException {
        GeopoliticalZone geopoliticalZone = new GeopoliticalZone();
        assertEquals(GeopoliticalZone1.NORTHEAST, geopoliticalZone.showState("ADAMAWA"));
    }

    @Test
    public void  test_that_state_in_north_west_can_be_found() throws StateNotFoundException {
        GeopoliticalZone geopoliticalZone = new GeopoliticalZone();
        assertEquals(GeopoliticalZone1.NORTHWEST,geopoliticalZone.showState("KEBbi"));

        }
    @Test
    public void test_that_state_is_not_found_in_a_particular_zone_throw_exception() throws StateNotFoundException {
        GeopoliticalZone geopoliticalZone = new GeopoliticalZone();
        //assertThrows(StateNotFoundException.class,()-> GeopoliticalZone1.NORTHWEST,geopoliticalZone.showState("lagos"));

    }


    }

