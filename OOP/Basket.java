package OOP;

public class Basket {
    private Product[] products;

    public void setProducts(Product[] products) {
        this.products = products;
    }

    public Basket(Product product, Product pr2) {
    }

    public Basket(Product product) {
    }

    public Product[] getProducts() {
        return products;
    }

}
