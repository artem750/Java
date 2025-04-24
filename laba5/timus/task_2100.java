package laba5.timus;

import java.util.Scanner;

public class task_2100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine(); // consume the remaining newline

        int totalGuests = 2; // Маршалл и Лили

        for (int i = 0; i < n; i++) {
            String response = scanner.nextLine();
            if (response.endsWith("+one")) {
                totalGuests += 2; // друг + его пара
            } else {
                totalGuests += 1; // только друг
            }
        }

        // Проверка на суеверие
        if (totalGuests == 13) {
            totalGuests += 1; // добавляем манекен
        }

        int totalCost = totalGuests * 100;
        System.out.println(totalCost);
    }
}