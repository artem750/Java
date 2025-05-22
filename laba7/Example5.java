package laba7;

import java.io.File;
import java.util.Scanner;

public class Example5 {

    public static void main(String[] args) {
        // Запрос названия файла у пользователя
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите путь к файлу:");
        String filePath = scanner.nextLine();

        // Создание объекта File
        File file = new File(filePath);

        // Проверка существования файла
        if (file.exists()) {
            // Получение размера файла в байтах
            long fileSize = file.length();
            System.out.println("Размер файла: " + fileSize + " байт");
        } else {
            System.out.println("Файл не найден: " + filePath);
        }
    }
}
