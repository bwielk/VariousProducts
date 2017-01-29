package example.codeclan.com.shop123;
import behaviour.*;

/**
 * Created by user on 29/01/2017.
 */

public class Jacket extends Product implements Sellable{

    private int size;
    private String fabric;

    public Jacket(int price, String name, int size, String fabric) {
        super(price, name);
        this.size = size;
        this.fabric = fabric;
    }

    public int getSize(){
        return this.size;
    }

    public String getFabric(){
        return this.fabric;
    }
}