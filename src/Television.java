public class Television {

    private boolean isOn;
    private int volume;
    private int channel;

    public boolean myTvIsOn(){
        return isOn;
    }


    public void powerOn() {
        isOn = true;
    }

    public void powerOff() {
        isOn = false;
    }

    public int getVolume(){
        return volume;
    }

    public int getChannel(){
        return channel;
    }

    public void increaseVolume() {
        if(myTvIsOn()){
            if(volume >= 0 && volume <= 10){
                volume++;
            }
        }
    }

    public void decreaseVolume() {
        if(myTvIsOn()){
            if(volume > 0 && volume < 10){
                volume--;
            }
        }
    }

    public void forwardChannel() {
        if(myTvIsOn()){
            if(channel > 25){
                channel++;
            }
        }
    }
}
