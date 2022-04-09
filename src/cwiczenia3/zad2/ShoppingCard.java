package cwiczenia3.zad2;
import java.util.ArrayList;

public class ShoppingCard {
    private static int COUNTER_ID = 0;
    private int id = COUNTER_ID++;
    private ArrayList<Products> products = new ArrayList<>();

    public void sell(){
        for (Products product : this.products) {
            product.sell();
        }
    }
    public ArrayList<Products> getProducts() {
        return products;
    }

    public int getId() {
        return id;
    }
}
