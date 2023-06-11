package jAVA.Java;

public class t_2 {
    public static void main(String[] args) {
        int count = 0;
        int[] mass = new int[] { 1, 2, 1, 2, -1, 1, 3, 1, 3, -1, 0 };
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] < 0) {
                count += mass[i - 1];
            }
        }
        System.out.println("Ответ: " + count);
    }
}
