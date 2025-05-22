package laba7.Example2;


import java.io.*;
import java.util.Scanner;

public class Example2_6 {

    public static void main(String[] args) {
        // Ввод данных с консоли
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите данные для записи в файл (введите 'exit' для завершения ввода):");

        String inputFileName = "src/laba7/Example2/input.txt";
        String outputFileName = "src/laba7/Example2/output.txt";

        try (PrintWriter printWriter = new PrintWriter(inputFileName, "UTF-8")) {
            String line;
            while (!(line = scanner.nextLine()).equals("exit")) {
                printWriter.println(line);
            }
            System.out.println("Данные записаны в файл: " + inputFileName);
        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл: " + e.getMessage());
        }

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(inputFileName));
             PrintWriter printWriter = new PrintWriter(outputFileName, "UTF-8")) {

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                printWriter.println(line.toUpperCase());
            }

            System.out.println("Данные записаны в файл: " + outputFileName);
        } catch (IOException e) {
            System.out.println("Ошибка при чтении/записи файла: " + e.getMessage());
        }
    }
}
