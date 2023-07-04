package live;

import java.util.ArrayList;
import java.util.Date;

import javax.xml.crypto.Data;

public class line {
    public static void main(String[] args) {

        long start1 = System.currentTimeMillis();
        int[] a = new int[99999999];
        for (int i = 0; i < a.length; i++) {
            a[i] = i;
        }
        a[4] = 0;
        long timeWorkCode1 = System.currentTimeMillis() - start1;
        System.out.println(timeWorkCode1);
        System.out.println("-----------------");
        long start2 = System.currentTimeMillis();
        ArrayList<Integer> f = new ArrayList<>();
        for (int i = 0; i < 99999999; i++) {
            f.add(i);
        }
        long timeWorkCode2 = System.currentTimeMillis() - start2;
        System.out.println(timeWorkCode2);
    }
}