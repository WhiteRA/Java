package OOP;

public class Product {
    private String name;
    private double price;
    private double rating;

    public Product(String name, double price, double rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    public String prnProduct() {
        return String.format("Название: %s; Цена: %.02f; Рейтинг: %.01f", name, price, rating);
    }

}
