package live;

import java.util.Arrays;
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

    /**
     * Генерирует случайное число в заданых приделах
     * 
     * @param a принимает минимальное число
     * @param b принимает максимальное число
     * @return Возвращает случайное число число
     */
    public static int randomNumber(int a, int b) {
        int namber = (int) (Math.random() * b) + a;
        return namber;
    }

    /*
     * От сюда начинается код относящийся к крестики-нолики
     */
    static char[][] map;
    public static final char PUSTO = '*';
    public static final char HUMAN = 'X';
    public static final char AI = 'O';

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
        int x = 0;
        int y = 0;
        do {
            System.out.println(" Твой ход ");
            System.out.print(" X - ");
            x = sc.nextInt() - 1;
            System.out.print("/ Y - ");
            y = sc.nextInt() - 1;
        } while (!cellEmpty(x, y));
        map[y][x] = HUMAN;
        sc.close();
    }

    /**
     * Проверка пустой ячейки
     * 
     * @param x координата ячейки
     * @param y координата ячейки
     * @return булеан если свободно тру, если занята клетка фолс
     */
    private static boolean cellEmpty(int x, int y) {
        if (map[y][x] == PUSTO)
            return true;
        return false;
    }
}