public class AirConditioner {

    private boolean airConditionerIsOn;
    private int temperature = 16;

    public boolean getAirConditionIsOn(){
        return airConditionerIsOn;
    }
    public void acIsOff() {
        airConditionerIsOn = false;

    }

    public void isOn(){
        airConditionerIsOn = true;
    }

    public void increaseTemperature(){
        if(getAirConditionIsOn() && temperature >= 16 && temperature < 30);
        temperature++;
    }


    public int getAcTemperature() {
        return temperature;
    }

    public void decreaseTemperature() {
        if(getAirConditionIsOn() && temperature >16  && temperature <= 30);
        temperature--;
    }
}
