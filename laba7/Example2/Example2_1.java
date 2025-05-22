package laba7.Example2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Example2_1 {

    public static void main(String[] args) {
        // Создание папки
        File folder = new File("src/laba7/Example2/example_folder");

        if (folder.exists()) {
            System.out.println("Папка создана: " + folder.getAbsolutePath());
        } else {
            if (folder.mkdir()) {
                System.out.println("Папка создана: " + folder.getAbsolutePath());
            } else {
                System.out.println("Не удалось создать папку: " + folder.getAbsolutePath());
            }
        }

        // Создание файла внутри папки
        File file = new File(folder.getAbsolutePath() + File.separator + "example_file.txt");

        try {
            if (file.createNewFile()) {
                System.out.println("Файл создан: " + file.getAbsolutePath());
            } else {
                System.out.println("Не удалось создать файл: " + file.getAbsolutePath());
            }
        } catch (IOException e) {
            System.out.println("Ошибка при создании файла: " + e.getMessage());
        }

        // Ввод данных с консоли и запись в файл
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите данные для записи в файл:");
        String data = scanner.nextLine();

        try (FileWriter writer = new FileWriter(file)) {
            writer.write(data);
            System.out.println("Данные записаны в файл: " + file.getAbsolutePath());
        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл: " + e.getMessage());
        }

        // Удаление файла и папки
        if (file.delete()) {
            System.out.println("Файл удален: " + file.getAbsolutePath());
        } else {
            System.out.println("Не удалось удалить файл: " + file.getAbsolutePath());
        }

        if (folder.delete()) {
            System.out.println("Папка удалена: " + folder.getAbsolutePath());
        } else {
            System.out.println("Не удалось удалить папку: " + folder.getAbsolutePath());
        }
    }
}
