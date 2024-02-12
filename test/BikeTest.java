import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BikeTest {

    private Bike myBike;

    @BeforeEach
    public void initializer() {
        myBike = new Bike();
    }

    @Test
    public void testBikeIsOn_bikeIsOn() {
        assertFalse(myBike.myBikeIsOn());
        myBike.powerOn();
        assertTrue(myBike.myBikeIsOn());

    }

    @Test
    public void testBikeIsOff_bikeIsOn() {
        myBike.powerOn();
        assertTrue(myBike.myBikeIsOn());

        myBike.powerOff();
        assertFalse(myBike.myBikeIsOn());

    }

    @Test
    public void testGearIsOne_bikeAccelerate() {
        myBike.powerOn();
        assertTrue(myBike.myBikeIsOn());

        myBike.accelerateBike();
        assertEquals(1,myBike.getSpeed());


        myBike.accelerateBike();

        assertEquals(2, myBike.getSpeed());

    }

    @Test
    public void testGearIsTwo_bikeAccelerateByTwo() {
        myBike.powerOn();
        assertTrue(myBike.myBikeIsOn());

        myBike.accelerateBike();
        assertEquals(1,myBike.getSpeed());

        myBike.accelerateBike();
        myBike.accelerateBike();

        assertEquals(3, myBike.getSpeed());

    }

    @Test
    public void testGear_bikeCanDecelerate() {
        myBike.powerOn();
        assertTrue(myBike.myBikeIsOn());

        for (int index = 0; index < 16; index++) {
            myBike.accelerateBike();
        }
        assertEquals(16, myBike.getSpeed());

        for (int index = 16; index >= 1; index--) {
            myBike.decelerateBike();
        }
        assertEquals(0, myBike.getSpeed());

    }

    @Test
    public void testGearSpeedInRange() {
        myBike.powerOn();


        for (int index = 1; index <= 50; index++) {
            myBike.accelerateBike();
        }
            assertEquals(4, myBike.changeGear());


    }

    }
//}
