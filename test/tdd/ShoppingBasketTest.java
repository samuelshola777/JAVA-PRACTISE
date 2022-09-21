package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShoppingBasketTest {

    @Test
    public void totalOfItem(){
        ShoppingBasket basket = new ShoppingBasket();
        assertEquals(0.0, basket.getTotal(),0.0);

    }
    @Test
    public void addingItemToTotal(){
        ShoppingBasket basket = new ShoppingBasket();
        assertEquals(1.0, basket.getTotal());
    }


}
