package exeptions.S_3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите данные: Фамилия Имя Отчество датарождения номертелефона пол");
        String input = scanner.nextLine();

        try {
            processUserData(input);
            System.out.println("Данные успешно обработаны и записаны в файл.");
        } catch (UserDataFormatException e) {
            System.err.println("Ошибка в формате данных: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Ошибка при записи в файл: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private static void processUserData(String input) throws UserDataFormatException, IOException {
        String[] data = input.split("\\s+");
        if (data.length != 6) {
            throw new UserDataFormatException("Неверное количество данных");
        }

        String surname = data[0];
        String firstName = data[1];
        String middleName = data[2];
        String dateOfBirth = data[3];
        long phoneNumber;
        char gender;

        try {
            phoneNumber = Long.parseLong(data[4]);
        } catch (NumberFormatException e) {
            throw new UserDataFormatException("Ошибка в формате номера телефона");
        }

        if (!data[5].matches("[mf]")) {
            throw new UserDataFormatException("Ошибка в формате пола (должен быть 'm' или 'f')");
        } else {
            gender = data[5].charAt(0);
        }

        String fileName = surname + ".txt";
        String formattedData = String.format("%s%s%s %s %d %c%n", surname, firstName, middleName, dateOfBirth,
                phoneNumber, gender);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {
            writer.write(formattedData);
        }
    }
}
