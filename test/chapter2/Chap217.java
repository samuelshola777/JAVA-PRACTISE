package chapter2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Chap217 {
    SumingNumber sumnumber;


    @BeforeEach
    void startallTestWith(){
        sumnumber = new SumingNumber();
    }

    @Test
    public void sumTest(){
        assertEquals(6, sumnumber.getSum(1, 2, 3));
    }

    @Test
    public void averageTest(){
       assertEquals(7,SumingNumber.getAverage(7,7,7));
    }
    @Test
    public void productTest(){
        assertEquals(1000,sumnumber.getProduct(10,10,10));
    }
    @Test
    public void largeNumberTest(){
        assertEquals(90,sumnumber.getlargeNumer(90, 70 ,50));
    }
   @Test
   public void SmallNumberTest(){
        assertEquals(10,sumnumber.getSmallNumber(70,600,10));
    }
}
