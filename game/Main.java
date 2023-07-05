package game;

public class Main {
    public static void main(String[] args) {
        Hero hero1 = new Hero("Konan");
        // hero1.getInfoOfHero();
        System.out.println("----------------------------");
        for (int i = 0; i < 5; i++) {
            hero1.luckCheck();
        }
    }
}
