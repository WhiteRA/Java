package OOP.t_2;

class Human implements Runnable, Jumpable {
    @Override
    public void run() {
        System.out.println("Человек бежит");
    }

    @Override
    public void jump() {
        System.out.println("Человек прыгает");
    }
}
