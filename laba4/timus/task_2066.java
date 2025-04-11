package laba4.timus;

import java.util.Scanner;

public class task_2066 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int min = Integer.MAX_VALUE;

        // Все возможные перестановки чисел a, b, c
        int[][] permutations = {
                {a, b, c},
                {a, c, b},
                {b, a, c},
                {b, c, a},
                {c, a, b},
                {c, b, a}
        };

        // Все возможные комбинации операторов
        char[] operators = {'+', '-', '*'};

        for (int[] nums : permutations) {
            for (char op1 : operators) {
                for (char op2 : operators) {
                    int result = evaluate(nums[0], nums[1], nums[2], op1, op2);
                    if (result < min) {
                        min = result;
                    }
                }
            }
        }

        System.out.println(min);
    }

    private static int evaluate(int x, int y, int z, char op1, char op2) {
        // Вычисляем выражение с учетом приоритета операций
        int firstOpResult;
        if (op1 == '*') {
            firstOpResult = x * y;
            // Теперь применяем второй оператор к firstOpResult и z
            switch (op2) {
                case '+': return firstOpResult + z;
                case '-': return firstOpResult - z;
                case '*': return firstOpResult * z;
            }
        } else {
            // Первый оператор не умножение, поэтому второй оператор может иметь приоритет
            if (op2 == '*') {
                int secondOpResult = y * z;
                switch (op1) {
                    case '+': return x + secondOpResult;
                    case '-': return x - secondOpResult;
                    case '*': return x * secondOpResult;
                }
            } else {
                // Оба оператора не умножение, просто вычисляем слева направо
                int temp;
                switch (op1) {
                    case '+': temp = x + y; break;
                    case '-': temp = x - y; break;
                    case '*': temp = x * y; break;
                    default: temp = 0;
                }
                switch (op2) {
                    case '+': return temp + z;
                    case '-': return temp - z;
                    case '*': return temp * z;
                    default: return 0;
                }
            }
        }
        return 0;
    }
}