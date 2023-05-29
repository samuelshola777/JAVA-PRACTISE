import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AirConditionerTest {
    @Test
    public void turnOn() {
        AirConditioner myAirconditioner = new AirConditioner();

        myAirconditioner.turnon();
        assertTrue(myAirconditioner.powerMode());
    }
   @Test
   public void turnOff(){
        AirConditioner myAirconditioner = new AirConditioner();

        myAirconditioner.turnoff();
        assertFalse(myAirconditioner.powerMode());
    }
    @Test
    public void setTemperature(){
        AirConditioner myAconditioner = new AirConditioner();

        myAconditioner.turnon();
       myAconditioner.setTemperature(16);
       assertEquals(16, myAconditioner.getTemperature());


    }
    @Test
    public void decreaseTemperature(){
        AirConditioner myAirconditioner = new AirConditioner();
        myAirconditioner.turnon();
        myAirconditioner.setTemperature(30);
        myAirconditioner.decreaseTemperature(4);
        assertEquals(26, myAirconditioner.getTemperature());

    }

    public static class AirConditioner {

       private boolean power;

       private int temperature;
        public boolean powerMode(){
            return power;
        }

        public void turnon() {
        if (power == false){
            power = true;
        }
        }

        public void turnoff() {
            if (power == true){
                power = false;
            }
        }

        public void setTemperature(int degree) {
            if (temperature >= 16) {
                if (temperature <= 30) {
                    temperature = degree;
                }
            }

        }

        public int getTemperature() {
            return temperature;
        }

        public void decreaseTemperature(int degree) {
            temperature = temperature - degree;
            if (temperature < 16) {
                temperature = 16;
            }
        }
    }
}
