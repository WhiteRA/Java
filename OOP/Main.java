package OOP;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Category сategory_1 = new Category();

        // Создал товары
        ArrayList<Product> prod = new ArrayList<Product>();
        for (int i = 0; i < 10; i++) {
            prod.add(new Product("Product " + i, i * 5, i + 1));
        }
        for (int i = 0; i < prod.size(); i++) {
            System.out.println(prod.get(i).getInfo());
        }

    }
}
