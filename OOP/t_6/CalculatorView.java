package OOP.t_6;

interface CalculatorView<T> {
    void showResult(T result);

    void showError(String message);
}
