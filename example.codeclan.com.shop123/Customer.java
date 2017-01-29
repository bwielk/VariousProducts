package example.codeclan.com.shop123;
import behaviour.*;

import java.util.ArrayList;

/**
 * Created by user on 29/01/2017.
 */

public class Customer {

    ArrayList<Sellable> basket;

    public Customer(){
        basket = new ArrayList<Sellable>();
    }

    public void buy(Sellable product){
        basket.add(product);
    }

    public int numberOfBoughtItems(){
        return basket.size();
    }

    public int total(){
        int total = 0;
        for(Sellable product : basket){
            total += product.getPrice();
        }
        return total;
    }
}
