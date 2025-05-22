package laba7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Example6 {

    public static void main(String[] args) {
        // Запрос имени файла и слова для поиска у пользователя
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите путь к файлу:");
        String filePath = scanner.nextLine();
        System.out.println("Введите слово для поиска:");
        String searchWord = scanner.nextLine();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            int lineNumber = 0;
            boolean found = false;

            // Поиск слова в файле
            while ((line = reader.readLine()) != null) {
                lineNumber++;
                if (line.contains(searchWord)) {
                    System.out.println("Строка " + lineNumber + ": " + line);
                    found = true;
                }
            }

            if (!found) {
                System.out.println("Слово '" + searchWord + "' не найдено в файле.");
            }
        } catch (IOException e) {
            System.out.println("Ошибка при чтении файла: " + e.getMessage());
        }
    }
}
