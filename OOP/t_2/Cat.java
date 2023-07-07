package OOP.t_2;

class Cat implements Runnable, Jumpable {
    @Override
    public void run() {
        System.out.println("Кот бежит");
    }

    @Override
    public void jump() {
        System.out.println("Кот прыгает");
    }
}
