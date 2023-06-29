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

    public String getInfo() {
        return String.format("Название: %d; Цена: %d; Рейтинг: %D", name, price, rating);
    }

    /*
     * @Override
     * public String toString() {
     * return prnProduct();
     * }
     */

}
