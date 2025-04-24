package laba5.Example1;

import java.util.List;
import java.util.stream.Collectors;

public class Example1_3 {
    public static void main(String[] args) {
        String string = "Функции, которые принимают на вход список строк, " +
                "строки, возвращают новый список, содержащий только те строки, " +
                "которые начинаются с большой буквы.";

        // Удаляем знаки препинания и разбиваем строку на слова
        List<String> strings = List.of(string.replaceAll("[^a-zA-Zа-яА-Я\\s]", "").split("\\s+"));

        System.out.println("Исходный список строк: ");
        for (String s : strings) {
            System.out.println(s);
        }

        List<String> stringsAfter = filterCapitalizedStrings(strings);

        System.out.println("Строки после фильтрации: ");
        for (String s : stringsAfter) {
            System.out.println(s);
        }
    }

    public static List<String> filterCapitalizedStrings(List<String> list) {
        return list.stream()
                .filter(s -> !s.isEmpty() && Character.isUpperCase(s.charAt(0)))
                .collect(Collectors.toList());
    }
}
