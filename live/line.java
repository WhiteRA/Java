package live;

public class line {
    public static void main(String[] args) {
        lib.initMap(3);
        lib.printMap();
        while (true) {
            lib.gamer();
            if (lib.mapFull()) {
                System.out.println("НИЧЬЯ");
                break;
            }
            lib.printMap();
            lib.ai();
            if (lib.mapFull()) {
                System.out.println("НИЧЬЯ");
                break;
            }
            lib.printMap();

        }

    }

}