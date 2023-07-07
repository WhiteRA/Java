package OOP.t_2;

class Wall {
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    public void check(Jumpable participant) {
        participant.jump();
        if (participant instanceof Runnable) {
            System.out.println("Не смог перепрыгнуть");
        } else {
            System.out.println("Успешно перепрыгнул");
        }
    }
}
