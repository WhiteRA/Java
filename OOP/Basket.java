package OOP;

public class Basket {
    private Product[] products;

    public void setProducts(Product[] products) {
        this.products = products;
    }

    public Basket(Product product) {
        if (product == null) {
            System.out.println(" Корзина пуста ");
        }else{
            System.out.println(product);
        }
    }

    public Product[] getProducts() {
        return products;
    }

}
