package exeptions.S_2;

import java.io.FileNotFoundException;

public class t_2 {
    public static void main(String[] args) {
        try {
            int[] intArray = new int[8];
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("--> Catching exception: " + e);
        }

    }

}
