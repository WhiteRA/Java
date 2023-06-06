package jAVA;
import java.util.Scanner;

public class L_1 {
    public static void main (String[]args)
      {
	int count = 0;
	Scanner scanner = new Scanner (System.in);
	  System.out.print ("Введите число");
	int size_mass = scanner.nextInt ();
	int[] mass = new int[]{ 1, 2, 1, 2, -1, 1, 3, 1, 3, -1, 0 };
	for (int i = 0; i < mass.length; i++)
	  {
	    if (mass[i] < 0)
	      {
		count += mass[i - 1];
	      }
	  }
	scanner.close ();
	System.out.println (count);
      }
}
