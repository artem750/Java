package laba5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example8 {
    public static void main(String[] args) {
        // Пример списка строк
        List<String> strings = Arrays.asList(
                "Функции",
                "которые",
                "принимают",
                "на",
                "вход",
                "список",
                "строк",
                "и",
                "возвращают",
                "новый",
                "список",
                "содержащий",
                "только",
                "те",
                "строки",
                "которые",
                "имеют",
                "длину",
                "больше",
                "заданного",
                "значения"
        );

        // Заданное значение длины
        int minLength = 5;

        // Вывод исходного списка
        System.out.println("Исходный список строк: ");
        strings.forEach(System.out::println);

        // Получаем список строк с длиной больше заданного значения
        List<String> filteredStrings = filterStringsByLength(strings, minLength);

        // Вывод результата
        System.out.println("Список строк с длиной больше " + minLength + ": ");
        filteredStrings.forEach(System.out::println);
    }

    // Функция для фильтрации строк по длине
    public static List<String> filterStringsByLength(List<String> list, int minLength) {
        return list.stream()
                .filter(s -> s.length() > minLength) // Фильтруем строки по длине
                .collect(Collectors.toList()); // Собираем результат в новый список
    }
}
