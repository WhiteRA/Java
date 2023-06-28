package OOP;

public class Category {
    private String name;
    private Product[] products;

    public Category(String name, Product[] products) {
        this.name = name;
        this.products = products;
    }

    public String getname() {
        return name;
    }

    public Product[] getProduct() {
        return products;
    }
}
