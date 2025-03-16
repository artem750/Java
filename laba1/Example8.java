package laba1;

import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите название текущего дня недели: ");
        String dayOfWeek = in.nextLine();

        System.out.println("Введите название текущего месяца: ");
        String month = in.nextLine();

        System.out.println("Введите текущую дату (номер дня в месяце): ");
        int dayOfMonth = in.nextInt();

        System.out.printf("Сегодня: %s, %d %s\n", dayOfWeek, dayOfMonth, month);

        in.close();
    }
}
