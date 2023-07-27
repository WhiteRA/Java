package exeptions.S_2;

import java.util.Scanner;

public class heep {
    public static double number() {
        Scanner scaner = new Scanner(System.in);
        System.out.println("Введите дробное число число:");
        double a = scaner.nextDouble();
        scaner.close();
        System.out.println("--------------------- " + a);
        return a;
    }

    public static String string() {
        Scanner scaner = new Scanner(System.in);
        System.out.println("Введите что угодно");
        String a = scaner.nextLine();
        scaner.close();
        return a;
    }
}
