package OOP.t_2;

public class Main {
    public static void main(String[] args) {
        Runnable human = new Human();
        Runnable cat = new Cat();
        Runnable robot = new Robot();

        Jumpable humanJumper = new Human();
        Jumpable catJumper = new Cat();

        Treadmill treadmill = new Treadmill(100);
        treadmill.check(human); // Человек бежит, Успешно пробежал
        treadmill.check(cat); // Кот бежит, Успешно пробежал
        treadmill.check(robot); // Робот бежит, Не смог пробежать

        Wall wall = new Wall(2);
        wall.check(humanJumper); // Человек прыгает, Не смог перепрыгнуть
        wall.check(catJumper); // Кот прыгает, Успешно перепрыгнул
    }
}
