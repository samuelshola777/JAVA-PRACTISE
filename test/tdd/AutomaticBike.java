package tdd;

public class AutomaticBike {

    private boolean power;

    private int speed;



    public boolean powerMode() {
        return power;
    }

    public void turnon() {
        if (power == false) {
            power = true;
        }
    }

    public void turnoff() {
        if (power == true) {
            power = false;
        }
    }

}
