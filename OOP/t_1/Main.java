package OOP.t_1;

public class Main {
    public static void main(String[] args) {

        // Создаем категории и товары
        Category category1 = new Category("Электроника");
        Category category2 = new Category("Одежда");
        // Создаём товары
        Product product1 = new Product("Смартфон", 1000, 4.5);
        Product product2 = new Product("Телевизор", 2000, 4.2);
        Product product3 = new Product("Футболка", 20, 3.8);
        Product product4 = new Product("Шорты", 30, 4.0);

        // Добавляем товары в соответствующие категории
        category1.addProduct(product1);
        category1.addProduct(product2);
        category2.addProduct(product3);
        category2.addProduct(product4);

        // Создаем пользователей
        User user1 = new User("user1", "password1");
        User user2 = new User("user2", "password2");

        // Добавляем товары в корзину пользователей
        user1.getBasket().addProduct(product1);
        user1.getBasket().addProduct(product3);
        user2.getBasket().addProduct(product2);
        user2.getBasket().addProduct(product4);

    }
}