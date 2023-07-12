package live;

public class line {
    public static void main(String[] args) {
        Foo[] s = { new Foo(0, 0, "null"), new Foo(0, 0, "1"), new Foo(0, 0, "2"), new Foo(0, 0, "3") };
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i].getName());
        }
        System.out.println(Doo.x);
    }
}