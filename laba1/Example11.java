package laba1;

import java.util.Scanner;
import java.time.Year;

public class Example11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите ваше имя: ");
        String name = in.nextLine();

        System.out.println("Введите ваш год рождения: ");
        int birthYear = in.nextInt();

        int currentYear = Year.now().getValue();

        int age = currentYear - birthYear;

        System.out.printf("Привет, %s! Ваш возраст: %d\n", name, age);

        in.close();
    }
}
