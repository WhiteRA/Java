package OOP.t_5.tephon_list;

import java.util.Scanner;

public class PhoneBookApp {
    public static void main(String[] args) {
        PhoneBookModel model = new PhoneBookModel();
        PhoneBookView view = new PhoneBookView();
        PhoneBookPresenter presenter = new PhoneBookPresenter(model, view);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            view.displayMenu();
            int choice = scanner.nextInt();
            scanner.nextLine(); // Очистка буфера после считывания числа
            presenter.handleInput(choice);
        }
    }
}
