package live;

public class line {
    public static void main(String[] args) {
        Worker[] a = new Worker[5];
        for (int i = 0; i < a.length; i++) {
            a[i] = new Worker("Ivanov Ivan" + i, "Engineer", "ivivan@mailbox.com", "892312312", i * 100,
                    lib.rnd(40, 50));

        }
        Worker.getInfoToMass(a);
    }

}