package live;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class lib {
    public static void miror(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 1) {
                a[i] = 0;
            } else {
                a[i] = 1;
            }
        }
        System.out.println(Arrays.toString(a));
    }

    public static void fillingUp3(int[] a) {
        int w = 1;
        for (int i = 0; i < a.length; i++) {
            a[i] = w;
            w += 3;
        }
        System.out.println(Arrays.toString(a));
    }

    public static void upper(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 6) {
                a[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(a));
    }

    public static void minMax(int[] a) {
        int max = 0;
        int min = 0;
        for (int i = 0; i < a.length; i++) {
            if (min > a[i]) {
                min = a[i];
            }
            if (max < a[i]) {
                max = a[i];
            }
        }
        System.out.println("min " + min);
        System.out.println("max " + max);
    }

    public static void calc() {
        Scanner in = new Scanner(System.in);
        System.out.print("Первое число ");
        int first = in.nextInt();
        System.out.print("Второе число ");
        int second = in.nextInt();
        System.out.print("Какая операция ");
        System.out.print("+ , - , / , * ");
        String operation = in.next();

        switch (operation) {
            case "+":
                first += second;
                System.out.println(first);
                break;
            case "-":
                first -= second;
                System.out.println(first);
                break;
            case "/":
                first /= second;
                System.out.println(first);
                break;
            case "*":
                first *= second;
                System.out.println(first);
                break;

            default:
                break;
        }
        in.close();
    }

    /**
     * Просит указать число
     * 
     * @return Возвращает полученное число
     */
    public static int inputNumberOfUser() {
        System.out.println("Ввод числа ");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        in.close();
        return a;
    }

    /*
     * От сюда начинается код относящийся к крестики-нолики
     */
    static char[][] map;
    public static final char PUSTO = '*';
    public static final char HUMAN = 'X';
    public static final char AI = 'O';
    static Random rnd = new Random();

    /**
     * Метод пострания поля (2х мерной ЧАРовской матрицы)
     * Который ссылается на static char[][] map
     * 
     * @param size Определяет размер поля без учёта гранниц
     */
    public static void initMap(int size) {
        map = new char[size][size];
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map.length; j++) {
                map[i][j] = PUSTO;
            }
        }
    }

    /**
     * Печать поля
     */
    public static void printMap() {
        System.out.println();
        System.out.println("0 1 2 3");
        for (int i = 0; i < map.length; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < map.length; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }

    /**
     * Ход игрока
     */
    public static void gamer() {
        Scanner sc = new Scanner(System.in);
        int x, y;
        do {
            System.out.println(" Твой ход ");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!cellEmpty(x, y));
        map[y][x] = HUMAN;
    }

    /**
     * Проверка пустой ячейки
     * 
     * @param x координата ячейки
     * @param y координата ячейки
     * @return булеан если свободно тру, если занята клетка фолс
     */
    private static boolean cellEmpty(int x, int y) {
        if (x < 0 || y < 0 || x > map.length || y > map.length)
            return false;
        return map[y][x] == PUSTO;
    }

    public static void ai() {
        int x, y;
        do {
            System.out.print(" Ход компа ");
            x = rnd.nextInt(3);
            y = rnd.nextInt(3);
        } while (!cellEmpty(x, y));
        map[y][x] = AI;
    }

    public static boolean mapFull() {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map.length; j++) {
                if (map[i][j] == PUSTO)
                    return false;
            }
        }
        return true;
    }

    public static boolean chekWin(char dot) {

        for (int i = 0; i < 3; i++) { // проверяем строки и столбцы
            if (map[i][0] == dot && map[i][1] == dot && map[i][2] == dot)
                return true; // строки
            if (map[0][i] == dot && map[1][i] == dot && map[2][i] == dot)
                return true; // столбцы
        }
        // проверяем диагонали
        if (map[0][0] == dot && map[1][1] == dot && map[2][2] == dot)
            return true;
        if (map[0][2] == dot && map[1][1] == dot && map[2][0] == dot)
            return true;

        return false; // вернуть ложь, если условия не выполняются
    }

    public static void game() {
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