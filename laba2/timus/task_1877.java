package laba2.timus;

import java.util.Scanner;

public class task_1877 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String lockCode1 = scanner.nextLine();
        String lockCode2 = scanner.nextLine();
        int code1 = Integer.parseInt(lockCode1);
        int code2 = Integer.parseInt(lockCode2);

        if (code1 % 2 == 0 || code2 % 2 == 1) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
