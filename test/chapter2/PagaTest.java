package chapter2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PagaTest {

    Paga newAcct;
    @BeforeEach public void beginEachTestWith(){
        newAcct =  new Paga();
    }

    @Test public void canDepositIntoAccountTest(){
        newAcct.depositInto("12345", 2000);
        assertEquals(2000, newAcct.getBalance());
    }

    @Test public void canDepositAndWithdrawFromAcctTest(){
        newAcct.depositInto("12345", 2000);
        newAcct.withdraw(1000, "1234");
        assertEquals(1000, newAcct.getBalance());
    }
}
