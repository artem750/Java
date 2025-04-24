package laba5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example11 {
    public static void main(String[] args) {
        // Пример списка чисел
        List<Integer> numbers = Arrays.asList(10, 5, 20, 15, 30, 7, 25, 1);

        // Заданное значение
        int threshold = 10;

        // Вывод исходного списка
        System.out.println("Исходный список чисел: ");
        numbers.forEach(System.out::println);

        // Получаем список чисел, меньших заданного значения
        List<Integer> filteredNumbers = filterNumbersLessThan(numbers, threshold);

        // Вывод результата
        System.out.println("Список чисел, меньших " + threshold + ": ");
        filteredNumbers.forEach(System.out::println);
    }

    // Функция для фильтрации чисел, меньших заданного значения
    public static List<Integer> filterNumbersLessThan(List<Integer> list, int threshold) {
        return list.stream()
                .filter(x -> x < threshold) // Фильтруем числа, меньшие заданного значения
                .collect(Collectors.toList()); // Собираем результат в новый список
    }
}
