package live;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Product> order;
    private int namber;

    public Order(int namber) {
        this.namber = namber;
        order = new ArrayList<>();
    }
}
