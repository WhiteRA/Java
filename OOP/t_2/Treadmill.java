package OOP.t_2;

class Treadmill {
    private int length;

    public Treadmill(int length) {
        this.length = length;
    }

    public void check(Runnable participant) {
        participant.run();
        if (participant instanceof Jumpable) {
            System.out.println("Не смог пробежать");
        } else {
            System.out.println("Успешно пробежал");
        }
    }
}
