package OOP.t_5.calculator;

class CalculatorView {
    public void displayMenu() {
        System.out.println("Calculator Menu");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.println("0. Exit");
        System.out.print("Enter your choice: ");
    }

    public void displayResult(double result) {
        System.out.println("Result: " + result);
    }

    public void displayComplexResult(double real, double imaginary) {
        System.out.println("Result: " + real + " + " + imaginary + "i");
    }

    public void displayErrorMessage(String message) {
        System.out.println("Error: " + message);
    }
}