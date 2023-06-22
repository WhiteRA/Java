package live;

public class line {
    public static void main(String[] args) {
        lib.initMap(3);
        lib.printMap();
        if ((lib.chekWin(lib.HUMAN))) {
            System.out.println(" ПОБЕДА ");
        }
        while (true) {
            lib.gamer();
            if (lib.mapFull()) {
                System.out.println("НИЧЬЯ");
                break;
            }
            lib.printMap();
            if ((lib.chekWin(lib.AI))) {
                System.out.println(" ПРОИГРЫШ ");
            }
            lib.ai();
            if (lib.mapFull()) {
                System.out.println("НИЧЬЯ");
                break;
            }
            lib.printMap();

        }

    }

}