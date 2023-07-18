package live;

public class line {
    public static void main(String[] args) {
        Calc<Double> a1 = new Calc<Double>(2.3, 2.3);
        Calc<Integer> a2 = new Calc<Integer>(2, 2);
        a1.slojenie();
        a2.slojenie();
    }

}