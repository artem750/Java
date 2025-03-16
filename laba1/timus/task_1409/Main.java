package laba1.timus.task_1409;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int G = scanner.nextInt();
        int L = scanner.nextInt();

        scanner.close();

        int notShotByGarry = L - 1;
        int notShotByLarry = G - 1;

        System.out.println(notShotByGarry + " " + notShotByLarry);
    }
}
