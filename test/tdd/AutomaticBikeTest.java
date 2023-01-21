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
//@Test
//public void turnoff(){
//
//    AutomaticBike myAutomaticBike = new AutomaticBike();
//
//    myAutomaticBike.turnoff();
//
//    assertFalse(myAutomaticBike.powerMode());
//
//}
@Test
public void turnOn(){
    AutomaticBike myAutomaticBike = new AutomaticBike();
    myAutomaticBike.turnon();
    assertEquals(true,myAutomaticBike.powerMode());
}
@Test
    public void createGear(){
    AutomaticBike myAutomaticBike = new AutomaticBike();
    assertEquals(1,myAutomaticBike.setGear());

}


}