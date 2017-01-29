package example.codeclan.com.shop123;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 29/01/2017.
 */
public class JacketTest {

    Jacket jacket;

    @Before
    public void before(){
        jacket = new Jacket(75, "Zeus", 38, "Cashmere");
    }

    @Test
    public void canGetName(){
        String name = jacket.getName();
        assertEquals("Zeus", name);
    }

    @Test
    public void canGetPrice(){
        int price = jacket.getPrice();
        assertEquals(75, price);
    }

    @Test
    public void canGetSize(){
        int size = jacket.getSize();
        assertEquals(38, size);
    }

    @Test
    public void canGetFabric(){
        String fabric = jacket.getFabric();
        assertEquals("Cashmere", fabric);
    }

}