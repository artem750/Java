package laba5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example5 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        System.out.println("Исходный список чисел: ");
        numbers.forEach(System.out::println);

        List<Integer> squaredNumbers = squareNumbers(numbers);

        System.out.println("Список квадратов чисел: ");
        squaredNumbers.forEach(System.out::println);
    }

    public static List<Integer> squareNumbers(List<Integer> list) {
        return list.stream()
                .map(x -> x * x) // Преобразуем каждый элемент в его квадрат
                .collect(Collectors.toList()); // Собираем результат в новый список
    }
}
