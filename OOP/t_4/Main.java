package OOP.t_4;

public class Main {
    public static void main(String[] args) {
        Calculator<Integer> calculator = new Calculator<>();
        int result1 = calculator.multiply(5, 3); // Результат: 15

        Calculator<Double> calculator2 = new Calculator<>();
        double result2 = calculator2.multiply(2.5, 4.0); // Результат: 10.0

        Calculator<Integer> calculator3 = new Calculator<>();
        int result3 = calculator3.divide(10, 2); // Результат: 5

        Calculator<Double> calculator4 = new Calculator<>();
        double result4 = calculator4.divide(8.0, 2.0); // Результат: 4.0

        Calculator<String> calculator5 = new Calculator<>();
        String resul5t = calculator5.binaryConversion("42"); // Результат: "101010"

        Calculator<Integer> calculator6 = new Calculator<>();
        String result26 = calculator6.binaryConversion(16); // Результат: "10000"
    }
}
