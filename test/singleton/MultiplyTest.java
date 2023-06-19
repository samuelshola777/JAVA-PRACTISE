package singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultiplyTest {
    Multiply multiply = new Multiply();
    @Test
    void testThatWeCanMultiPy(){
        assertEquals(27, multiply.multiply(9,3));
    }

}