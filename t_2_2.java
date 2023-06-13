package jAVA;

import java.util.Scanner;

public class t_2_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Размер последовательнисти: ");
        int num = in.nextInt();
        int[] myArray = new int[num];

        System.out.print("Начало: ");
        int beginning = in.nextInt();
        System.out.println("Убывающая - down/ Возрастающая - up: ");
        String status = in.next();
        
        switch (status) {
            case "down":
                for (int i = 0; i < myArray.length; i++) {
                    myArray[i] = beginning;
                    beginning--;
                }
                break;
            case "up":
                for (int i = 0; i < myArray.length; i++) {
                    myArray[i] = beginning;
                    beginning++;
                }
                break;
            default:
                break;
        }
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] > beginning) {
                
            }else{
                System.out.println("Убывающая");
            }
        }
        in.close();
    }
}
