package laba7.Example2;


import java.io.*;
import java.util.Scanner;

public class Example2_5 {

    public static void main(String[] args) {
        // Ввод данных с консоли
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите данные для записи в файл (введите 'exit' для завершения ввода):");

        String inputFileName = "src/laba7/Example2/input.txt";
        String outputFileName = "src/laba7/Example2/output.txt";

        try (
                // Байтовый выходной поток в файл
                OutputStream outputStream = new FileOutputStream(inputFileName);
                // Адаптер для преобразования символов в байты с указанием кодировки
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, "UTF-8");
                // Буферизированный символный выходной поток
                BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter)
        ) {
            String line;
            while (!(line = scanner.nextLine()).equals("exit")) {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
            System.out.println("Данные записаны в файл: " + inputFileName);
        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл: " + e.getMessage());
        }

        try (
                // Байтовый входной поток из файла
                InputStream inputStream = new FileInputStream(inputFileName);
                // Адаптер для преобразования байтов в символы с указанием кодировки
                InputStreamReader inputStreamReader = new InputStreamReader(inputStream, "UTF-8");
                // Буферизированный символный входной поток
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

                // Байтовый выходной поток в файл
                OutputStream outputStream = new FileOutputStream(outputFileName);
                // Адаптер для преобразования символов в байты с указанием кодировки
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, "UTF-8");
                // Буферизированный символный выходной поток
                BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter)
        ) {
            String line;
            // Читаем построчно, конвертируем в верхний регистр и записываем в выходной файл
            while ((line = bufferedReader.readLine()) != null) {
                bufferedWriter.write(line.toUpperCase());
                bufferedWriter.newLine();
            }
            System.out.println("Данные записаны в файл: " + outputFileName);
        } catch (IOException e) {
            System.out.println("Ошибка при чтении/записи файла: " + e.getMessage());
        }
    }
}
