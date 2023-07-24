package live;

import java.util.ArrayList;
import java.util.List;

public class Warehouse {
    private String name;
    private List<Product> warehouse;

    public Warehouse(String name) {
        this.name = name;
        warehouse = new ArrayList<>();
    }

}
