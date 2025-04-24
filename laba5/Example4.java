package laba5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example4 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList(
                "Функции", "которые", "принимают", "на", "вход",
                "список", "строк", "строки", "возвращают", "новый",
                "список", "содержащий", "только", "те", "строки",
                "которые", "начинаются", "с", "большой", "буквы"
        );

        System.out.println("Исходный список строк: ");
        strings.forEach(System.out::println);

        List<String> capitalizedStrings = filterCapitalizedStrings(strings);

        System.out.println("Список строк, начинающихся с большой буквы: ");
        capitalizedStrings.forEach(System.out::println);
    }

    public static List<String> filterCapitalizedStrings(List<String> list) {
        return list.stream()
                .filter(s -> !s.isEmpty() && Character.isUpperCase(s.charAt(0)))
                .collect(Collectors.toList());
    }
}
