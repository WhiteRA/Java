package OOP.t_7;

public class Main {
    public static void main(String[] args) {

        CalculatorPresenter<RationalNumber> presenter = new CalculatorPresenterImpl<>(new ConsoleLogger());
        CalculatorView<RationalNumber> view = new CalculatorViewImpl<>(presenter);

        view.run();
    }
}
