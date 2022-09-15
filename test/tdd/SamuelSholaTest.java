package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SamuelSholaTest {


@Test

 public void getNameTest(){
    SamuelShola boneShaker = new SamuelShola();

    boneShaker.setName("samuel shola");

    String myName = boneShaker.getName();
    assertEquals("samuel shola", myName);
}


}
