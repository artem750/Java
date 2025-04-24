package laba5;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example7 {
    public static void main(String[] args) {
        // Пример списка чисел
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        // Заданное число, на которое нужно проверить делимость
        int divisor = 3;

        // Вывод исходного списка
        System.out.println("Исходный список чисел: ");
        numbers.forEach(System.out::println);

        // Получаем список чисел, делящихся на divisor без остатка
        List<Integer> divisibleNumbers = filterDivisibleNumbers(numbers, divisor);

        // Вывод результата
        System.out.println("Список чисел, делящихся на " + divisor + " без остатка: ");
        divisibleNumbers.forEach(System.out::println);
    }

    // Функция для фильтрации чисел, делящихся на заданное число без остатка
    public static List<Integer> filterDivisibleNumbers(List<Integer> list, int divisor) {
        return list.stream()
                .filter(x -> x % divisor == 0) // Фильтруем числа, делящиеся на divisor без остатка
                .collect(Collectors.toList()); // Собираем результат в новый список
    }
}
