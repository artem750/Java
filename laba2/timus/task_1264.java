package laba2.timus;

import java.util.Scanner;

public class task_1264 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        long linesOfCode = (long) (M + 1) * N;
        System.out.println(linesOfCode);
    }
}
