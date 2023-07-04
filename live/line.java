package live;

import java.util.ArrayList;

public class line {
    public static void main(String[] args) {
        /*
         * long start1 = System.currentTimeMillis();
         * 
         * ArrayList<Integer> f = new ArrayList<>();
         * for (int i = 0; i < 99999999; i++) {
         * f.add(i);
         * }
         * 
         * long timeWorkCode1 = System.currentTimeMillis() - start1;
         * System.out.println(timeWorkCode1);
         * 
         * System.out.println("-----------------");
         * 
         * long start2 = System.currentTimeMillis();
         * f.remove(4);
         * f.add(4, null);
         * long timeWorkCode2 = System.currentTimeMillis() - start2;
         * System.out.println(timeWorkCode2);
         */

        long start1 = System.currentTimeMillis();
        int[] g = new int[99999999];
        int[] v = new int[g.length - 1];
        for (int i = 0; i < g.length; i++) {
            g[i] = i;
        }
        g[4] = 0;
        for (int i = 0; i < v.length; i++) {
            if (g[i] != 0) {
                v[i] = g[i];
            }
        }
        long timeWorkCode1 = System.currentTimeMillis() - start1;
        System.out.println(timeWorkCode1);
    }
}