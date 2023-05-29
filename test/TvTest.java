import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tdd.MyTvTest;

import static org.junit.jupiter.api.Assertions.*;

public class TvTest {
    MyTvTest myTv;
    @BeforeEach
    public void autoCreateObject(){
        MyTvTest myTv = new MyTvTest();
    }


    @Test
    public void createSecondClass(){

        MyTvTest myTv = new MyTvTest();
        assertNotNull(myTv);

    }
    @Test
    public void turnOn(){
        MyTvTest myTv = new MyTvTest();
        myTv.turnOn();
        assertTrue(myTv.PowerMode());
    }
@Test
    public void turnOff(){
    MyTvTest myTv = new MyTvTest();
    myTv.turnOn();
    myTv.turnOff();
    assertFalse(myTv.PowerMode());
}
//@Test
//    public void setVolumeUp(){
//        turnOn();
//
//
//        assertEquals(2, MyTvTest.setVolumeUp());
//}
//@Test
//    public void testVolumeUp(){
//
//    turnOn();
//    setVolumeUp();
//    setVolumeUp();
//
//    assertEquals(4, MyTvTest.setVolumeUp());
//}

//@Test
//    public void increaseVolumeTest(){
//    MyTvTest myTv = new MyTvTest();
//    myTv.turnOn();
//    myTv.increaseVolume();
//    myTv.increaseVolume();
//    myTv.increaseVolume();
//    assertEquals(4, myTv.getVolumeUp());
//}
@Test
    public void increaseVolumeTest(){
    MyTvTest myTv = new MyTvTest();
    myTv.turnOn();
    myTv.increaseVolumeTest();

    assertEquals(2,myTv.getVolumeUp());
}

//
}
