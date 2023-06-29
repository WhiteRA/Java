package OOP;

import java.util.ArrayList;
import java.util.List;

public class Category {
  private String name;
  private List<Product> products = new ArrayList<>();
  public int length;

  public Category(String name, List<Product> products) {
    this.name = name;
    this.products = products;
  }

  public Category() {
  }

  public String getCategory() {
    return name;
  }

  public String setCategory(String name) {
    return this.name = name;
  }

  public void addProdact(Product product) {
    products.add(product);
  }

  public void removeProduct(Product product) {
    products.remove(product);
  }

  public String getInfo() {
    return String.format("Название категории - %s", name);
  }

}
