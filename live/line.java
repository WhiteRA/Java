package live;

public class line {
    public static void main(String[] args) {

        Sotrudnik[] s1 = new Sotrudnik[5];
        for (int i = 0; i < s1.length; i++) {
            s1[i] = new Sotrudnik("AAA", lib.rnd(20, 50));
        }
        for (int i = 0; i < s1.length; i++) {
            if (s1[i].getAge() > 40) {
                s1[i].print();
            }
        }

    }
}