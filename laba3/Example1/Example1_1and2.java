package laba3.Example1;



import java.util.ArrayList;
import java.util.Collections;

public class Example1_1and2 {
    public static void main(String[] args) {
        int x = 0; // Начальное значение x, вы можете изменить его на любое значение в диапазоне [0, 20)
        ArrayList<Integer> sequence = new ArrayList<>();

        // Генерация последовательности
        System.out.println("Последовательность значений в прямом порядке:");
        while (x >= 0 && x < 20) {
            System.out.print(x + " ");
            sequence.add(x);
            x = 2 * x + 1;
        }
        System.out.println();

        // Вывод последовательности в обратном порядке
        Collections.reverse(sequence);
        System.out.println("Последовательность значений в обратном порядке:");
        for (int value : sequence) {
            System.out.print(value + " ");
        }
    }

    public static class Example1_4 {
        public static void main(String[] args) {
            System.out.println(fact(5));
        }

        public static int fact(int n) {
            int result;
            if (n == 1) return 1;
            else {
                result = fact(n - 1) * n;
                return result;
            }
        }
    }
}
