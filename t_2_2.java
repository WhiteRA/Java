package jAVA;

import java.util.Scanner;
import java.util.Arrays;

public class t_2_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Размер последовательнисти: ");
        int num = in.nextInt();
        int[] myArray = new int[num];

        System.out.print("Начало: ");
        int beginning = in.nextInt();
        System.out.print("Конец: ");
        int end = in.nextInt();
        if (end > myArray.length) {
            System.out.println("Последовательность слишком большая");
            }else{
                for (int i = 0; i < myArray.length; i++) {
                    myArray[i] = beginning;
                    beginning++;
                    //System.out.println(myArray[i]);
            }
        }
        System.out.println(Arrays.toString(myArray));
    }
}
