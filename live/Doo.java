package live;

public abstract class Doo {
    protected int a;
    protected int b;
    protected String name;
    static int x;

    public Doo(int a, int b, String name) {
        this.a = a;
        this.b = b;
        this.name = name;
        x++;
    }

    public abstract void plusPrint();

    public abstract String getName();
}
