package products;

/**
 * Created by user on 29/01/2017.
 */

public abstract class Product {

    private int price;
    private String name;

    public Product(int price, String name){
        this.price = price;
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public int getPrice(){
        return this.price;
    }

}
