package OOP;

public class User {
    String login;
    String password;
    Basket basket;

    public User(String login, String password, Basket basket) {
        this.login = login;
        this.password = password;
        this.basket = basket;
    }
}
