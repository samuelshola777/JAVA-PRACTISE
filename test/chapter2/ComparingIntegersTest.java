package chapter2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ComparingIntegersTest {


    private ComparingIntegers comparingIntegers;

    @BeforeEach
    void startAllTestWith() {
        comparingIntegers = new ComparingIntegers();

    }

    @Test

    public void thatObjectExist() {
        assertNotNull(true);
    }

    @Test
    public void inputTest() {
     //   assertTrue( true,78);
    }
}