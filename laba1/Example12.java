package laba1;

import java.util.Scanner;
import java.time.Year;

public class Example12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите ваш возраст: ");
        int age = in.nextInt();

        int currentYear = Year.now().getValue();

        int birthYear = currentYear - age;

        System.out.printf("Ваш год рождения: %d\n", birthYear);

        in.close();
    }
}
