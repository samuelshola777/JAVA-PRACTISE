package PracticeMart;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AdditionTest {
    Addition addition;
    @BeforeEach
    void doThisEveryStart(){
        addition = new Addition();
    }

    @Test
    public void addTwoNumbertest(){
        assertEquals(6,addition.addTwoNum(2, 4));
    }

    @Test
    public void multiplyTest(){
        assertEquals(12,addition.multiply(2, 6));
    }
    @Test
    public void divideNumberTest(){
        assertEquals(4, addition.divide(12, 3));
    }
}
