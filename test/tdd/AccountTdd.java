package tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AccountTdd {
    AAccount aaccount;

    @BeforeEach
    public void autoCreateObject(){
         aaccount = new AAccount();

    }


@Test
    public void createAnObjectOfClassAccount(){
    AAccount aaccount = new AAccount();

    assertNotNull(aaccount);
}
@Test
public void testToCreateAccountUser(){

    aaccount.setName("SAMUELSHOLA");
    assertEquals("SAMUELSHOLA",aaccount.getName());
    assertEquals("14, 06, 1996", aaccount.getDateOfBirth());

}

}
