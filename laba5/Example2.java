package laba5;

import java.util.Arrays;

public class Example2 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("Исходный массив: ");
        System.out.println(Arrays.toString(numbers));

        int[] evenNumbers = filterEvenNumbers(numbers);

        System.out.println("Массив четных чисел: ");
        System.out.println(Arrays.toString(evenNumbers));
    }

    public static int[] filterEvenNumbers(int[] array) {
        return Arrays.stream(array)
                .filter(x -> x % 2 == 0)
                .toArray();
    }
}
