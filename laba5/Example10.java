package laba5;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example10 {
    public static void main(String[] args) {
        // Пример списка строк
        List<String> strings = Arrays.asList(
                "Hello",
                "World123",
                "Java",
                "Docker!",
                "SSH",
                "12345",
                "Container",
                "Orchestration"
        );

        // Вывод исходного списка
        System.out.println("Исходный список строк: ");
        strings.forEach(System.out::println);

        // Получаем список строк, содержащих только буквы
        List<String> filteredStrings = filterStringsWithOnlyLetters(strings);

        // Вывод результата
        System.out.println("Список строк, содержащих только буквы: ");
        filteredStrings.forEach(System.out::println);
    }

    // Функция для фильтрации строк, содержащих только буквы
    public static List<String> filterStringsWithOnlyLetters(List<String> list) {
        return list.stream()
                .filter(s -> s.matches("[a-zA-Z]+")) // Фильтруем строки, содержащие только буквы
                .collect(Collectors.toList()); // Собираем результат в новый список
    }
}
