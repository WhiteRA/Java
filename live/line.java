package live;

public class line {
    public static void main(String[] args) {
        Worker[] a = new Worker[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = new Worker("Ivanov Ivan" + i, "Engineer", "ivivan@mailbox.com", "892312312", i * 100,
                    lib.rnd(35, 50));
            if (a[i].getAge() > 40) {
                System.out.println(a[i].toString());
            }
        }
    }     
}