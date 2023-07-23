package OOP.t_5;

import java.util.Scanner;

// Главный класс
public class Main {
    public static void main(String[] args) {
        CalculatorModel model = new CalculatorModel();
        CalculatorView view = new CalculatorView();
        CalculatorPresenter presenter = new CalculatorPresenter(model, view);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            view.displayMenu();
            int choice = scanner.nextInt();
            presenter.handleInput(choice);
        }
    }
}
