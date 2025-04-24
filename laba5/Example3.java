package laba5;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Example3 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5, 6};
        int[] array2 = {4, 5, 6, 7, 8, 9};

        System.out.println("Массив 1: " + Arrays.toString(array1));
        System.out.println("Массив 2: " + Arrays.toString(array2));

        int[] commonElements = findCommonElements(array1, array2);

        System.out.println("Общие элементы: " + Arrays.toString(commonElements));
    }

    public static int[] findCommonElements(int[] array1, int[] array2) {
        // Преобразуем второй массив в множество для быстрого поиска
        Set<Integer> set2 = new HashSet<>();
        for (int num : array2) {
            set2.add(num);
        }

        // Фильтруем элементы первого массива, оставляя только те, которые есть во втором массиве
        return Arrays.stream(array1)
                .filter(set2::contains)
                .toArray();
    }
}
