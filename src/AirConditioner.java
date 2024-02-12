public class AirConditioner {

    private boolean airConditionerIsOn;

    public boolean getAirConditionIsOn(){
        return airConditionerIsOn;
    }
    public boolean acIsOff() {
        airConditionerIsOn = false;
        return airConditionerIsOn;
    }

    public boolean isOn(){
        airConditionerIsOn = true;
        return airConditionerIsOn;
    }







}
