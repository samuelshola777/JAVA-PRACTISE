package tdd;

public class AutomaticBike {

    private boolean power;

    private int speed;

    private  int gear;



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
    public void  turnOn(){
        if (power == false){
            power = true;
        }
    }

    public int setGear() {

            int gear =   1;



        return gear;
    }
}
