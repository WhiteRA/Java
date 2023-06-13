package jAVA;

import java.util.Scanner;

public class t_3{
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("До какого числа ? ");
        int num = in.nextInt();
        int i, j;
        boolean check;  
        for (i = 2; i < num; i++) {
            check = true;
            for (j = 2; j < i; j++) {
                if ((i % j) == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.println(i);

            }
        }
    }
}