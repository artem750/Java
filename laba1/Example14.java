package laba1;

import java.util.Scanner;

public class Example14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите число: ");
        int number = in.nextInt();

        int oneLess = number - 1;
        int oneMore = number + 1;
        int sum = oneLess + number + oneMore;
        int squareOfSum = sum * sum;

        System.out.printf("Последовательность: %d, %d, %d, %d\n", oneLess, number, oneMore, squareOfSum);

        in.close();
    }
}
