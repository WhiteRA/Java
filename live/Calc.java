package live;

public class Calc<N extends Number> {
    private N num1;
    private N num2;

    public Calc(N num1, N num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public void slojenie() {
        if (num1 instanceof Integer && num2 instanceof Integer) {
            int sum = 0;
            sum = num1.intValue() + num2.intValue();
            System.out.println(sum);
        } else {
            double sum = 0;
            sum = num1.doubleValue() + num2.doubleValue();
            System.out.println(sum);
        }
    }

}
