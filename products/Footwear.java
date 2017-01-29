package products;
import behaviour.*;

/**
 * Created by user on 29/01/2017.
 */

public class Footwear extends Product implements Sellable{

    int heel_cm;

    public Footwear(int price, String name, int heel_cm){
        super(price, name);
        this.heel_cm = heel_cm;
    }

    public int getHeel(){
        return this.heel_cm;
    }
}
