package example.codeclan.com.shop123;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 29/01/2017.
 */
public class CustomerTest {

    Customer customer;
    Jacket jacket;
    Footwear shoe;

    @Before
    public void before(){
        customer = new Customer();
        jacket = new Jacket(76, "XYZ", 38, "wool" );
        shoe = new Footwear(50, "Joan", 2);
    }

    @Test
    public void canBuyJacket(){
        customer.buy(jacket);
        int number = customer.numberOfBoughtItems();
        assertEquals(1, number);
    }

    @Test
    public void canBuyShoes(){
        customer.buy(jacket);
        customer.buy(shoe);
        int number = customer.numberOfBoughtItems();
        int total = customer.total();
        assertEquals(2, number);
        assertEquals(126, total);
    }
}