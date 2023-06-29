package OOP;

public class Main {
    public static void main(String[] args) {
        Product[] pr1 = new Product[3];
        pr1[0] = new Product("Product 1", 19.99, 1.2);
        pr1[1] = new Product("Product 2", 29.99, 2.2);
        pr1[2] = new Product("Product 3", 39.99, 3.2);
        Product[] pr2 = new Product[3];
        pr2[0] = new Product("Product 4", 49.99, 4.2);
        pr2[1] = new Product("Product 5", 59.99, 5.2);
        pr2[2] = new Product("Product 6", 69.99, 6.2);
        
        
        Category[] cat1 = new Category[2];
        cat1[0] = new Category("Category 1", pr1[0]);
        cat1[1] = new Category("Category 1", pr1[1]);
        Category[] cat2 = new Category[2];
        cat2[0] = new Category("Category 2", pr2[0]);
        cat2[0] = new Category("Category 2", pr2[1]);

        Basket[] bas1 = new Basket[2];
        bas1[0] = new Basket(pr1[0]); 
        
        User user1 = new User("user1@mail.ru", "null_1");
        User user2 = new User("user2@mail.ru", "null_2");

    }
}
