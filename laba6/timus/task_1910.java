package laba6.timus;
import java.util.Scanner;

public class task_1910 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Чтение количества секций
        int n = scanner.nextInt();

        // Чтение сил магического поля для каждой секции
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        int maxSum = 0;
        int middlePos = 0;

        // Поиск тройки с максимальной суммой
        for (int i = 0; i < n - 2; i++) {
            int currentSum = a[i] + a[i + 1] + a[i + 2];
            if (currentSum > maxSum) {
                maxSum = currentSum;
                middlePos = i + 2; // Позиция среднего элемента (индексация с 1)
            }
        }

        // Вывод результата
        System.out.println(maxSum + " " + middlePos);
    }
}