package exeptions.S_2;

public class t_4 {
    public static void main(String[] args) throws Exception {
        try {
            if (heep.string().isEmpty()) {
                throw new Exception();
            } else {
                System.out.println(" --> Вы ввели: " + heep.string());
            }
        } catch (Exception e) {
            System.out.println(" Пустые строки вводить нельзя ");
        }
    }
}
