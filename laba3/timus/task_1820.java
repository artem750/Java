package laba3.timus;

import java.util.Scanner;

public class task_1820 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int totalSides = 2 * n;
        int batches = (totalSides + k - 1) / k;
        int time = batches;

        if (time < 2) {
            time = 2;
        }

        System.out.println(time);
    }
}
