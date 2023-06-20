package T_3;

import java.util.ArrayList;
import java.util.Collections;

public class t_3_4 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(53);
        numbers.add(6);
        numbers.add(23);
        numbers.add(14);
        numbers.add(87);

        // Находим минимальное значение
        Integer min = Collections.min(numbers);
        System.out.println("Минимальное значение : " + min);

        // Находим максимальное значение
        Integer max = Collections.max(numbers);
        System.out.println("Максимальное значение : " + max);

        // Находим среднее значение
        double sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        double average = sum / numbers.size();
        System.out.println("Среднее значение : " + average);
    }
}
