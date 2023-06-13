package jAVA;

import java.util.Scanner;

public class t_2_1{
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("До какого числа ? ");
        int num = in.nextInt();
        int i, j;
        int k = 0;
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
                k+=i;
            }
        }
        System.out.println(k);
    }
}