package OOP;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // создал массив продуктов. Надо добавить в категорию.
        Product laptop = new Product("Ноутбук", 45000.0, 4);
        Product smartphone = new Product("Смартфон", 20000.0, 5);
        Category s1 = new Category();
        ArrayList<Product> products = new ArrayList<Product>();
    }
}
