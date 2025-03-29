package laba3;

import java.util.Scanner;

public class Example2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println("Пожалуйста, введите неотрицательное целое число.");
        } else {
            System.out.println("Двоичное представление: " + toBinary(number));
        }
    }

    public static String toBinary(int number) {
        // Базовый случай: если число равно 0, возвращаем "0"
        if (number == 0) {
            return "0";
        }
        // Рекурсивный случай: вызываем функцию для числа, деленного на 2, и добавляем остаток
        return toBinary(number / 2) + (number % 2);
    }
}
