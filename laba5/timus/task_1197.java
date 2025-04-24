package laba5.timus;

import java.util.Scanner;

public class task_1197 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine(); // consume the remaining newline

        for (int i = 0; i < n; i++) {
            String position = scanner.nextLine();
            int x = position.charAt(0) - 'a'; // converts 'a'-'h' to 0-7
            int y = position.charAt(1) - '1'; // converts '1'-'8' to 0-7

            int count = 0;

            // All possible 8 moves of a knight
            int[][] moves = {
                    {2, 1}, {2, -1},
                    {-2, 1}, {-2, -1},
                    {1, 2}, {1, -2},
                    {-1, 2}, {-1, -2}
            };

            for (int[] move : moves) {
                int newX = x + move[0];
                int newY = y + move[1];

                if (newX >= 0 && newX < 8 && newY >= 0 && newY < 8) {
                    count++;
                }
            }

            System.out.println(count);
        }
    }
}