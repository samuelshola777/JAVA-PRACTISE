package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AutomaticBikeTest {
    @Test
   public void turnon() {
        AutomaticBike myAutomaticBike = new AutomaticBike();

        myAutomaticBike.turnon();
        assertTrue(myAutomaticBike.powerMode());
    }
@Test
public void turnoff(){

    AutomaticBike myAutomaticBike = new AutomaticBike();

    myAutomaticBike.turnoff();

    assertFalse(myAutomaticBike.powerMode());

}

}