package OOP.t_6;

interface CalculatorPresenter<T> {
    void onAdd(T num1, T num2);

    void onSubtract(T num1, T num2);

    void onMultiply(T num1, T num2);

    void onDivide(T num1, T num2);
}
