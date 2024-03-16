import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AirConditionTest {

    @Test
    public void testThatIHaveAnAc(){
        AirConditioner airConditioner = new AirConditioner();
        assertNotNull(airConditioner);
    }

    @Test
    public void isOff(){
        AirConditioner airConditioner = new AirConditioner();
        airConditioner.isOn();
        assertTrue(airConditioner.getAirConditionIsOn());
    }

    @Test
    public void airConditionerIsOn(){
        AirConditioner airConditioner = new AirConditioner();
        airConditioner.isOn();
        assertTrue(airConditioner.getAirConditionIsOn());
        airConditioner.acIsOff();
        assertFalse(airConditioner.getAirConditionIsOn());

    }

    @Test
    public void acCanIncreaseTempereature(){
        AirConditioner airConditioner = new AirConditioner();
        airConditioner.isOn();
        assertTrue(airConditioner.getAirConditionIsOn());
        airConditioner.increaseTemperature();
        assertEquals(17,airConditioner.getAcTemperature());


    }
    @Test
    public  void testAccanAccelerateTwice() {
        AirConditioner airConditioner = new AirConditioner();
        airConditioner.isOn();
        assertTrue(airConditioner.getAirConditionIsOn());
        airConditioner.increaseTemperature();
        airConditioner.increaseTemperature();
        assertEquals(18, airConditioner.getAcTemperature());

    }

    @Test
    public  void testAcCanDecelerateTwice() {
        AirConditioner airConditioner = new AirConditioner();
        airConditioner.isOn();
        assertTrue(airConditioner.getAirConditionIsOn());
        airConditioner.decreaseTemperature();
        airConditioner.decreaseTemperature();
        assertEquals(14, airConditioner.getAcTemperature());

    }

    @Test
    public  void testAccanDecelerateTwice() {
        AirConditioner airConditioner = new AirConditioner();
        airConditioner.isOn();
        assertTrue(airConditioner.getAirConditionIsOn());
        airConditioner.increaseTemperature();
        airConditioner.increaseTemperature();
        assertEquals(18, airConditioner.getAcTemperature());

        airConditioner.decreaseTemperature();
        airConditioner.decreaseTemperature();
        assertEquals(16,airConditioner.getAcTemperature());

    }






}
