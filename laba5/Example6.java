package laba5;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example6 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList(
                "Функции, которые принимают на вход список строк",
                "строки, возвращают новый список",
                "содержащий только те строки",
                "которые содержат заданную подстроку",
                "например, строки с подстрокой 'строки'",
                "или строки с подстрокой 'список'"
        );

        String substring = "строки";

        System.out.println("Исходный список строк: ");
        strings.forEach(System.out::println);

        List<String> filteredStrings = filterStringsContainingSubstring(strings, substring);

        System.out.println("Список строк, содержащих подстроку \"" + substring + "\": ");
        filteredStrings.forEach(System.out::println);
    }

    public static List<String> filterStringsContainingSubstring(List<String> list, String substring) {
        return list.stream()
                .filter(s -> s.contains(substring)) // Фильтруем строки, содержащие подстроку
                .collect(Collectors.toList()); // Собираем результат в новый список
    }
}
