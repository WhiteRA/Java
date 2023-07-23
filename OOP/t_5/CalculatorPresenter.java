package OOP.t_5;

import java.util.Scanner;

class CalculatorPresenter {
    private CalculatorModel model;
    private CalculatorView view;

    public CalculatorPresenter(CalculatorModel model, CalculatorView view) {
        this.model = model;
        this.view = view;
    }

    public void handleInput(int choice) {
        Scanner scanner = new Scanner(System.in);

        switch (choice) {
            case 1:
                System.out.print("Enter the real part of the first number: ");
                double real1 = scanner.nextDouble();
                System.out.print("Enter the imaginary part of the first number: ");
                double imaginary1 = scanner.nextDouble();
                System.out.print("Enter the real part of the second number: ");
                double real2 = scanner.nextDouble();
                System.out.print("Enter the imaginary part of the second number: ");
                double imaginary2 = scanner.nextDouble();
                double sum = model.add(real1, imaginary1, real2, imaginary2);
                view.displayComplexResult(model.getReal(), model.getImaginary());
                break;
            case 2:
                // Аналогично для вычитания, умножения и деления
                // ...
                break;
            case 0:
                System.out.println("Exiting the calculator...");
                System.exit(0);
                break;
            default:
                view.displayErrorMessage("Invalid choice. Please try again.");
                break;
        }
    }
}
