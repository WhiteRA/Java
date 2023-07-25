package live;

public class Main {
    public static void main(String[] args) {
        Person a1 = new Person();
        Person a2 = new Person("1", 20);
        a1.move();
        a2.talk();
    }
}
