package OOP.t_5.calculator;

public class RationalCalculatorModel implements CalculatorModel {
    private double operand;
    private String operator;
    private double result;

    @Override
    public void setOperand(double operand) {
        this.operand = operand;
    }

    @Override
    public void setOperator(String operator) {
        this.operator = operator;
    }

    @Override
    public void calculate() {
        switch (operator) {
            case "+":
                result += operand;
                break;
            case "-":
                result -= operand;
                break;
            case "*":
                result *= operand;
                break;
            case "/":
                if (operand != 0) {
                    result /= operand;
                } else {
                    // Handle division by zero error
                    result = 0;
                }
                break;
            default:
                // Handle unsupported operator error
                break;
        }
    }

    @Override
    public double getResult() {
        return result;
    }
}
