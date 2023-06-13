package jAVA;
import java.util.Arrays;

public class t_2_3 {
    public static void main(String[] args) {
        int[] myArray = {1, 22, 33, 44, 5, -5, -3, 23, -7};
        int index = 0;
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] >= 10) {
                index += i;
            }
        }
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] < 0) {
                myArray[i] = index;
            }
        }
        System.out.println(Arrays.toString(myArray));
    }
}
