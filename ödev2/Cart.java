package ödev2;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    private List<Product> items = new ArrayList<>();

    public List<Product> getItems() {
        return items;
    }

    void add(Product p) {
        items.add(p);
    }

    void remove(Product p) {
        items.remove(p);
    }

    

    public double subtotal() {
        double subtotal = 0;

        for (Product item : items) {
            subtotal += item.getPrice();
        }
        return subtotal;
    }

    public double total() {

        double total = 0;

        for (Product item : items) {
            total += item.finalPrice();
        }
        return total;
    }

}
