package OOP.t_6;

import java.util.Scanner;

class CalculatorViewImpl<T> implements CalculatorView<T> {
    private CalculatorPresenter<T> presenter;

    public CalculatorViewImpl(CalculatorPresenter<T> presenter) {
        this.presenter = presenter;
    }

    public void showMenu() {
        System.out.println("1. Добавление ");
        System.out.println("2. Вычитание ");
        System.out.println("3. Умножение ");
        System.out.println("4. Деление ");
        System.out.println("5. Выход ");
    }

    public int getUserChoice() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Выберети номер пункта: ");
        return scanner.nextInt();
    }

    public T getInput(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        int numerator = scanner.nextInt();
        System.out.print("/");
        int denominator = scanner.nextInt();
        return (T) new RationalNumber(numerator, denominator);
    }

    @Override
    public void showResult(T result) {
        System.out.println("Ответ: " + result.toString());
    }

    @Override
    public void showError(String message) {
        System.out.println("Ошибка: " + message);
    }

    public void run() {
        int choice;
        do {
            showMenu();
            choice = getUserChoice();

            switch (choice) {
                case 1:
                    presenter.onAdd(getInput("Введите первое рациональное: "),
                            getInput("Введите второе рациональное число: "));
                    break;
                case 2:
                    presenter.onSubtract(getInput("Введите первое рациональное число: "),
                            getInput("Введите второе рациональное число: "));
                    break;
                case 3:
                    presenter.onMultiply(getInput("Введите первое рациональное число: "),
                            getInput("Введите второе рациональное число: "));
                    break;
                case 4:
                    presenter.onDivide(getInput("Введите первое рациональное число: "),
                            getInput("Введите второе рациональное число: "));
                    break;
                case 5:
                    System.out.println("Выход...");
                    break;
                default:
                    System.out.println("Неверные данные!");
            }
        } while (choice != 5);
    }
}
