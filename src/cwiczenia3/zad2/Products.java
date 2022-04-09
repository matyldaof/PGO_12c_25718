package cwiczenia3.zad2;
import java.util.ArrayList;
import java.util.List;

public class Products {
    private static final List<Products> ALL_PRODUCTS = new ArrayList<>();

    private String name;
    private ProductType productType;
    private double price;
    private int quantity;
    private Storage storage;


    public Products(String name, ProductType productType, double price, int quantity, Storage storage) {
        this.setName(name);
        this.setProductType(productType);
        this.setPrice(price);
        this.setQuantity(quantity);
        this.setStorage(storage);
        ALL_PRODUCTS.add(this);
    }

    public boolean isAvailable() {
        return this.quantity > 0;
    }

    public void sell() {
        if (this.isAvailable()) {
            this.quantity--;
        } else {
            throw new RuntimeException("Brak produktu");
        }
    }

    public void increaseQuantity(int counter) {
        if (counter <= 0) {
            throw new RuntimeException("Niepoprawna liczba produktów");
        }
        this.quantity += counter;
    }

    public Storage getStorage() {
        return storage;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isBlank()) {
            throw new RuntimeException("Nie może być puste");
        }
        this.name = name;
    }

    public void setProductType(ProductType productType) {
        if (productType == null) {
            throw new RuntimeException("Podaj typ produktu");
        }
        this.productType = productType;
    }

    public void setPrice(double price) {
        if (price < 0) {
            throw new RuntimeException("Cena produktu musi być większa niż zero");
        }
        this.price = price;
    }


    public void setStorage(Storage storage) {
        this.storage = storage;
    }

}
