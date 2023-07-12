package live;

public class Foo extends Doo {
    public Foo(int a, int b, String name) {
        super(a, b, name);
    }

    @Override
    public void plusPrint() {
        System.out.println(a + b);
    }

    @Override
    public String getName() {
        return name;
    }

}
