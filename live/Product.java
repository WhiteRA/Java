package live;

public class Product {
    private String name;
    private int count;
    private int price;

    public Product(String name, int count, int price) {
        this.name = name;
        this.count = count;
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Товар " + name + " в колличестве " + count + " по цене " + price;
    }
}
