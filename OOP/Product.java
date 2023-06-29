package OOP;

public class Product {
    String name;
    double price;
    double rating;

    public Product(String name, double price, double rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    public String prnProduct() {
        return String.format("Название: %s; Цена: %.02f; Рейтинг: %.01f", name, price, rating);
    }

}
