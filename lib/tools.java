package lib;

public class tools {

    /**
     * Создание рандома в заданных приделах
     * 
     * @param min Минимальная граница
     * @param max Максимальная граница
     * @return Число в диапазоне
     */
    public static int rnd(int min, int max) {
        int q = (int) ((Math.random() * ((max - min) + 1)) + min);
        return q;
    }

}