package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class WunmiTddTest {

    @Test
            void thatObjectExist() {
        WunmiTdd wunmiTdd = new WunmiTdd();
        assertNotNull(wunmiTdd);
    }


}
