package laba7;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Example7 {

    public static void main(String[] args) {
        // Запрос названия файла и текста для записи у пользователя
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите путь к файлу:");
        String filePath = scanner.nextLine();
        System.out.println("Введите текст для записи в файл:");
        String text = scanner.nextLine();

        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write(text);
            System.out.println("Текст успешно записан в файл: " + filePath);
            System.out.println("Количество записанных символов: " + text.length());
        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл: " + e.getMessage());
        }
    }
}
