package cwiczenia3.zad2;
import java.util.ArrayList;

public class Storage {
    private int deliveryTime;
    private ArrayList<Products> products = new ArrayList<>();

    public Storage(int deliveryTime) {
        this.setDeliveryTime(deliveryTime);
    }

    public int getDeliveryTime() {
        return deliveryTime;
    }

}
