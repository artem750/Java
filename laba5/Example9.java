package laba5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example9 {
    public static void main(String[] args) {
        // Пример списка чисел
        List<Integer> numbers = Arrays.asList(1, 5, 10, 15, 20, 25, 30);

        // Заданное значение
        int threshold = 10;

        // Вывод исходного списка
        System.out.println("Исходный список чисел: ");
        numbers.forEach(System.out::println);

        // Получаем список чисел, больших заданного значения
        List<Integer> filteredNumbers = filterNumbersGreaterThan(numbers, threshold);

        // Вывод результата
        System.out.println("Список чисел, больших " + threshold + ": ");
        filteredNumbers.forEach(System.out::println);
    }

    // Функция для фильтрации чисел, больших заданного значения
    public static List<Integer> filterNumbersGreaterThan(List<Integer> list, int threshold) {
        return list.stream()
                .filter(x -> x > threshold) // Фильтруем числа, большие заданного значения
                .collect(Collectors.toList()); // Собираем результат в новый список
    }
}
