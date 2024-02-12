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
        assertFalse(airConditioner.getAirConditionIsOn());
    }

    @Test
    public void airConditionerIsOn(){
        AirConditioner airConditioner = new AirConditioner();
        assertTrue(airConditioner.getAirConditionIsOn());

    }


}
