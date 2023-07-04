package live;

public class Worker {
    String fullName;
    String position;
    String email;
    String phone;
    int payday;
    int age;

    public Worker(String fullName, String position, String email, String phone, int payday, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.payday = payday;
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format(" %s %s %s %s %d %d", fullName, position, email, phone, payday, age);
    }

    public static void getInfoToMass(Worker[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i].toString());
        }
    }
}
