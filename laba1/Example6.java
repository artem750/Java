package laba1;

import java.util.Scanner;

public class Example6 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

        System.out.println("Input firstname: ");
        String firstname = in.nextLine();

        System.out.println("Input lastname: ");
        String lastname = in.nextLine();

        System.out.println("Input patronymic: ");
        String patronymic = in.nextLine();

        System.out.printf("Hello %s, %s, %s", lastname, firstname, patronymic);
        in.close();
    }
}