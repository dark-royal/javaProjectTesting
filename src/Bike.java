public class Bike {


    private boolean isOn;
    private int speed;
    private int gear;

    public boolean myBikeIsOn() {
        return isOn;
    }

    public int gear() {
        return gear;
    }

    public void powerOn() {
        isOn = true;
    }


    public void powerOff() {
        isOn = false;
    }





    public void accelerateBike() {
        if (myBikeIsOn()) {
            if (speed >= 0 && speed < 20) {
                speed++;
            } else if (speed >= 20 && speed <= 30) {
                speed += 2;
            } else if (speed >= 30 && speed <= 40) {
                speed += 3;
            } else if (speed >= 40) {
                speed += 4;
            }
        }
    }


    public void decelerateBike() {
        if (myBikeIsOn()) {
            if (speed >= 0 && speed < 20) {
                speed--;
            } else if (speed > 20 && speed <= 30) {
                speed -= 2;
            } else if (speed > 30 && speed <= 40) {
                speed -= 3;
            } else if (speed > 40) {
                speed -= 4;
            }

        }



    }

    public int getSpeed() {
        return speed;
    }

    public int changeGear() {
        if (myBikeIsOn()) {
            if (speed >= 0 && speed <= 20) {
                gear = 1;
            }
            if (speed > 20 && speed <= 30) {
                gear = 2;
            }
            if (speed >= 30 && speed <= 40) {
                gear = 3;
            }
            if (speed > 40) {
                gear = 4;
            }
        }
        return gear;
    }
}





















