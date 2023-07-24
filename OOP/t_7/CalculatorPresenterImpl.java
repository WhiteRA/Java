package OOP.t_7;

// Принцип SOLID: Принцип открытости/закрытости (Open/Closed Principle)
// CalculatorPresenterImpl реализует интерфейс CalculatorPresenter и не изменяется при добавлении новых операций,
// а только расширяется путем добавления новых методов для обработки новых операций.

class CalculatorPresenterImpl<T extends Number<T>> implements CalculatorPresenter<T> {
    private CalculatorView<T> view;

    public CalculatorPresenterImpl(CalculatorView<T> view) {
        this.view = view;
    }

    @Override
    public void onAdd(T num1, T num2) {
        T result = num1.add(num2);
        view.showResult(result);
    }

    @Override
    public void onSubtract(T num1, T num2) {
        T result = num1.subtract(num2);
        view.showResult(result);
    }

    @Override
    public void onMultiply(T num1, T num2) {
        T result = num1.multiply(num2);
        view.showResult(result);
    }

    @Override
    public void onDivide(T num1, T num2) {
        T result = num1.divide(num2);
        view.showResult(result);
    }
}
