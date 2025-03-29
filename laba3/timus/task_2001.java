package laba3.timus;
import java.util.Scanner;

public class task_2001 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Чтение трёх пар чисел
        int a1 = scanner.nextInt();
        int b1 = scanner.nextInt();

        int a2 = scanner.nextInt();
        int b2 = scanner.nextInt();

        int a3 = scanner.nextInt();
        int b3 = scanner.nextInt();

        // Вычисление x и y
        int x = a1 - a3;
        int y = b1 - b2;

        // Вывод результата
        System.out.println(x + " " + y);
    }
}