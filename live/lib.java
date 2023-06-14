package jAVA.live;

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

    public static void minMax(int[] a){
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

    public static void calc(){
        Scanner in = new Scanner(System.in);
        System.out.print("Первое число ");
        int first = in.nextInt();
        System.out.print("Второе число ");
        int second = in.nextInt();
        System.out.print("Какая операция ");
        System.out.print("+ , - , / , * ");
        String operation = in.nextLine();


        switch (operation) {
            case "+":
                System.out.println(first + second);
                break;
            case "-":
                System.out.println(first - second);
                break;
            case "/":
                System.out.println(first / second);
                break;
            case "*":
                System.out.println(first * second);
                break;
        
            default:
                break;
        }
    }
}
