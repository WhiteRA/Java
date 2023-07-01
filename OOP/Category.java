package OOP;

import java.util.ArrayList;
import java.util.List;

public class Category {
    private String name;
    List<Product> products;

    public Category(String name) {
        this.name = name;
        products = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void delProduct(Product product) {
        products.remove(product);
    }

    public Product[] getProducts() {
        return null;
    }

}
