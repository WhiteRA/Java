package T_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class t_3_2 {

    class Product {
        private String name;
        private String country;
        private double weight;
        private double price;
        private String grade;

        public Product(String name, String country, double weight, double price, String grade) {
            this.name = name;
            this.country = country;
            this.weight = weight;
            this.price = price;
            this.grade = grade;
        }

        public String getName() {
            return name;
        }

        public String getGrade() {
            return grade;
        }

        public double getPrice() {
            return price;
        }
    }

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        // products.add(new Product("Product A", "Country A", 100, 20, "Grade 1"));
        // products.add(new Product("Product B", "Country B", 200, 25, "Grade 2"));
        // products.add(new Product("Product C", "Country C", 150, 15, "Grade 1"));
        // products.add(new Product("Product D", "Country D", 120, 18, "Grade 2"));
        // products.add(new Product("Product E", "Country E", 180, 22, "Grade 1"));

        String targetGrade = "Grade 1";
        List<String> cheapestProducts = new ArrayList<>();

        // Находим минимальную цену для заданного сорта товара
        double minPrice = Double.MAX_VALUE;
        for (Product product : products) {
            if (product.getGrade().equals(targetGrade) && product.getPrice() < minPrice) {
                minPrice = product.getPrice();
            }
        }

        // Добавляем в список наименования товаров заданного сорта с наименьшей ценой
        for (Product product : products) {
            if (product.getGrade().equals(targetGrade) && product.getPrice() == minPrice) {
                cheapestProducts.add(product.getName());
            }
        }

        // Сортируем полученный список и выводим его в консоль
        Collections.sort(cheapestProducts);
        System.out.println("Наименования товаров заданного сорта с наименьшей ценой: " + cheapestProducts);
    }
}
