package OOP;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // Создал товары
        ArrayList<Product> prod = new ArrayList<Product>();
        for (int i = 0; i < 10; i++) {
            prod.add(new Product("Product " + i, i * 5, i + 1));
        }
        for (int i = 0; i < prod.size(); i++) {
            System.out.println(prod.get(i).getInfo());
        }

        System.out.println();

        // Создал категорию и добавил в неё товары из листа prod.
        Category cat = new Category("Category 1", prod);
        System.out.println(cat.getInfo());

    }
}
