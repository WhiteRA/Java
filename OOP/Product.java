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

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        } else {
            System.out.println(" Цена не может быть меньше 0 ");
        }
    }

    public void setRating(double rating) {
        if (rating >= 0) {
            this.rating = rating;
        } else {
            System.out.println(" Рейтинг не может быть меньше 0 ");
        }

    }

    public String prnProduct() {
        return String.format("Название: %s; Цена: %.02f; Рейтинг: %.01f", name, price, rating);
    }

}
