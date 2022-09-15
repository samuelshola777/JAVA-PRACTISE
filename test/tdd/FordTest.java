package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FordTest {
    @Test
    public void turnOn(){
        Ford Ford = new Ford();
      Ford.turnOn();
      assertTrue(Ford.powerStatus());
    }
   @Test
   public void turnOff(){
        Ford Ford = new Ford();
        Ford.powerStatus();
        assertFalse(Ford.powerStatus());
    }

   @Test
   public void powerOn(){
        Ford Ford = new Ford();
        Ford.powerOn();
        assertTrue(Ford.powerStatus());
    }

}
