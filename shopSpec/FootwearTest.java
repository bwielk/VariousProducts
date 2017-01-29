package example.codeclan.com.shop123;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 29/01/2017.
 */
public class FootwearTest {

    Footwear shoe;

    @Before
    public void before() {
        shoe = new Footwear(500, "Joan", 4);
    }

    @Test
    public void canGetPrice(){
        int price = shoe.getPrice();
        assertEquals(500, price);
    }

    @Test
    public void canGetName(){
        String name = shoe.getName();
        assertEquals("Joan", name);
    }

    @Test
    public void canGetHeelHeight(){
        int heel = shoe.getHeel();
        assertEquals(4, heel);
    }
}